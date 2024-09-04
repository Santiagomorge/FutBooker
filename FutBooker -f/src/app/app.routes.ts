import { Routes } from '@angular/router';
import {CrearReservaComponent} from './crear-reserva/crear-reserva.component';
import { provideHttpClient } from '@angular/common/http';


export const routes: Routes = [

    {path: 'reservar', component: CrearReservaComponent},

];

export const appConfig = {
    providers: [provideHttpClient(),]
};
