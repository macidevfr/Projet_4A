import { DataState } from "../enum/data-state.enum";

export interface AppState<T> {
    dataState : DataState;
    appData?: T;
    error?: string; //? means optional we not ganna have all atributes at the same time.
}