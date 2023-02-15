import { Account } from "./Account";

export class Transaction {
    id: number;
    amount: number;
    date: Date;
    account: Account;
}