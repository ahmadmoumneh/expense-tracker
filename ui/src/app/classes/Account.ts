import { User } from "./User";

export class Account {
    id: number;
    title: string;
    accountType: string;
    currency: string;
    balance: number;
    user: User;
}