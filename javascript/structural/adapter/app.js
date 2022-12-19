class XmlData {
    constructor(data) {
        this.data = data;
    }
}

class JsonData {
    constructor(data) {
        this.data = data;
    }
}

class SkiResortApp {
    displayXmlReceipt(XmlData) {
        console.log(XmlData.data);
    }
}

class UIService {
    displayJsonReceipt(JsonData) {
        console.log(JsonData.data);
    }
}

class UIServiceAdapter {
    constructor(uiService) {
        this.uiService = uiService; 
    }

    displayXmlReceipt(xmlData) {
        this.uiService.displayJsonReceipt(this.convertXmlToJson(xmlData));
    }

    convertXmlToJson(xmlData) {
        const data = xmlData.data;

        const matches = data.match(/((?<=>)(.*)(?=<))|((?<=<)([a-zA-Z]+)(?=>))/g);
        matches.splice(0, 1);

        const map = new Map();
        for (let i = 0; i < matches.length-1; i+=2) {
            map.set(matches[i], matches[i+1]);
        }

        let result = "{\n  \"";
        let i = 0;
        map.forEach((value, key) => {
            result += `${key}": "${value}"`;
            if (i !== map.size - 1) {
                result += ",\n  \"";
            }
            i++;
        })
        result += "\n}";
        
        return new JsonData(result);
    }
}

const app = new SkiResortApp();

const data = `<Receipt>\n\t<id>1</id>\n\t<client>Yuliana Bilak</client>\n\t<type>unlimited</type>` +
`\n\t<price>500.5</price>\n\t<sellDate>${new Date().toISOString()}</sellDate>\n</Receipt>`;
const xmlData = new XmlData(data);
app.displayXmlReceipt(xmlData);

const uiService = new UIService();
const adapter = new UIServiceAdapter(uiService);

adapter.displayXmlReceipt(xmlData);