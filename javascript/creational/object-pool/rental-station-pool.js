import RentalStation from "./rental-station.js";

class RentalStationPool {
    constructor() {
        this.pool = [
            new RentalStation("Station #1", "Polyanytsya, Ivano-Frankivsk Oblast, 78593", "free"),
            new RentalStation("Station #2", "Polyanytsya, Ivano-Frankivsk Oblast, 26754", "free"),
            new RentalStation("Station #3", "Polyanytsya, Ivano-Frankivsk Oblast, 94981", "free"),
            new RentalStation("Station #4", "Polyanytsya, Ivano-Frankivsk Oblast, 39782", "free")
        ];
    }

    getStation() {
        const station = this.pool.find(st => st.status === "free");
        if (!station) {
            console.error('No free rental stations right now.');
            return;
        }
        station.status = "busy";
        return station;
    }

    releaseStation(station) {
        station.status = "free";
    }
}

export default RentalStationPool;