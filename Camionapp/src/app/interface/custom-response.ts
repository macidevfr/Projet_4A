import { Camion } from "./camion";

export interface CustomResponse {
    
    timeStamp : Date;
    statusCode : number;
    status : string;
    reason: string;
    message : string;
    developperMessage : string;
    data: {camions?: Camion[], camion?: Camion };
}