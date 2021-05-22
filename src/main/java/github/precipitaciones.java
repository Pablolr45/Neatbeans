/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author pablo
 */

public class precipitaciones {
	
	public static void main (String[] args) {
		
		//Declaramos los arrays
		//Este sera el mes que defien la lluvia
		double []mesllu = new double[12];
		//Este sera el mes que defina la temperatura
		double []mestemp = new double[12];
		//Estos seran los 12 meses
		String []mes = {"Enero","Febrero","Marzo","Abril","Mayo","junio","Julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};
		
		//Declaramos las variables relacioadas con la lluvia y la temperatura
		double maxllu = 0, minllu = 0, mediallu = 0, llu1 = 0, llu2 = 0, llu3 = 0, llu4 = 0, maxtemp = 0, mintemp = 0, mediatemp = 0, temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0;
		String maxllumes = "", minllumes = "", maxtempmes = "", mintempmes = ""; 
		
		//Incluimos un for para que nos pregunte 12 veces por la media de la lluvia y la temperatura
		for (int i=0; i<12; i++){
			
			mesllu[i] = teclado.leer_double("Introduzca la media de precipitacion del mes " + (mes[i]) + ": ");
			mestemp[i] = teclado.leer_double("Introduzca la media de temperatura del mes " +(mes[i]) + ": " );
			
			//Pondremos un espacio para que se vea mejor
			System.out.println("");
			
			//declaramos el mes de lluvia y temperatura maxima y minima
			if(i==0){//if 1
				maxllumes = mes[i];
				minllumes = mes[i];
				maxtempmes = mes[i];
				mintempmes = mes[i];
			}else//Final if 1
				//Lluvia maxima
				if(i>0){//if 2
					if(mesllu[i]>maxllu){//if 3
						maxllu = mesllu[i];
						maxllumes = mes[i];
					}else//Final if 3
						//Lluvia minima
						if(mesllu[i]<minllu){// if 4
							minllu = mesllu[i];
							minllumes = mes[i];
						}//final if 4
						
				}//final if 2
				//Maxima temperatura
				if(i>0){//if 5
					if(mestemp[i]>maxtemp){//if 6
						maxtemp = mestemp[i];
						maxtempmes = mes[i];
					}//final if 6
					
				}else//Final if 5
					//minima temperatura
					if(mestemp[i]<mintemp){//if 7
						mintemp = mestemp[i];
						mintempmes = mes[i];
					}//Final if 7
					
				//Aqui hacemos la media anual y trimestrial de lluvia
				mediallu = mediallu + mesllu[i];
				llu1 = mesllu[0] + mesllu[1] + mesllu[2];
				llu2 = mesllu[3] + mesllu[4] + mesllu[5];
				llu3 = mesllu[6] + mesllu[7] + mesllu[8];
				llu4 = mesllu[9] + mesllu[10] + mesllu[11];	
				
				//Aqui hacemos la media anual y trimestrial de temperatura
				mediatemp = mediatemp + mestemp[i];
				temp1 = mestemp[0] + mestemp[1] + mestemp[2];
				temp2 = mestemp[3] + mestemp[4] + mestemp[5];
				temp3 = mestemp[6] + mestemp[7] + mestemp[8];
				temp4 = mestemp[9] + mestemp[10] + mestemp[11];
		}//Final for
		
		//Calculamos las medias de precipitaciones
		mediallu= mediallu/12;
		llu1 = llu1/3;
		llu2 = llu2/3;
		llu3 = llu3/3;
		llu4 = llu4/3;
		
		//Calculamos las medias de temperatura
		mediatemp= mediatemp/12;
		temp1 = temp1/3;
		temp2 = temp2/3;
		temp3 = temp3/3;
		temp4 = temp4/3;
		
		//Aqui decimos el mes donde mas y menos se ha detectado la media de lluvia y temperatura.
		System.out.printf("\nEn el mes de " + maxllumes + " se ha detectado la maxima precipitacion y es de: " + maxllu);
		
		System.out.printf("\nEn el mes de " + maxtempmes + " se ha detectado la maxima temperatura y es de: " + maxtemp);
		
		System.out.printf("\nEn el mes de " + minllumes + " se ha detectado la minima precipitacion y es de: " + minllu);
		
		System.out.printf("\nEn el mes de " + mintempmes + " se ha detectado la minima temperatura y es de: " + mintemp);
		
		System.out.printf("\nEn este primer trimestre la media de precipitaciones es: " + llu1);
		
		System.out.printf("\nEn este primer trimestre la media de Temperatura es: " + temp1);
		
		System.out.printf("\nEn este segundo trimestre la media de precipitaciones es: " + llu2);
		
		System.out.printf("\nEn este segundo trimestre la media de temperatura es: " + temp2);
		
		System.out.printf("\nEn este tercer trimestre la media de precipitaciones es: " + llu3);
		
		System.out.printf("\nEn este tercer trimestre la media de temperatura es: " + temp3);
		
		System.out.printf("\nEn este cuarto trimestre la media de precipitaciones es: " + llu4);
		
		System.out.printf("\nEn este cuarto trimestre la media de temperatura es: " + temp4);
		
		System.out.printf("\nEn este anio la media de precipitaciones es: " + mediallu);
		
		System.out.printf("\nEn este anio la media de temperatura es: " + mediatemp);
		
	}//Final main
}//Final class

