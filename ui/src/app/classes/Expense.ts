import { Category } from "./Category";
import { Transaction } from "./Transaction";
import { User } from "./User";

export class Expense {
    id: number;
    title: string;
    description: string;
    expenseType: string;
    pattern: string;
    frequency: string;
    priority: string;
    budget: number;
    deadline: Date;
    category: Category;
    user: User;
    notification: Notification;
    transaction: Transaction;
    payed: boolean;
}