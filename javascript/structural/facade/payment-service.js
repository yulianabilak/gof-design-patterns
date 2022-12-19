export class PaymentService {
    makePayment(priceToPay, client) {
        const dayOfWeek = new Date().getDay();
        if (dayOfWeek === 0 || dayOfWeek === 6) {
            priceToPay *= 1.05;
        }
        console.log(`Withdrawing ${priceToPay} UAH from client's ${client.name} bank account...`);
        return true;
    }
}