package Programacion.orientacionAObjetos.juegoOca;

public class Tablero {
	public  Casilla tablero[] = new Casilla [63];
	/*
	 * 
	 */
	public Tablero() {
		super();
		inicializaTablero();
	}
	
	public void inicializaTablero (){
		// Estructa b�sica del tablero
		
		tablero[0]=new Casilla(1, "Inicio", null, 0, "");
		tablero[1]=new Casilla(2, "Caballo", null, 0, "");
		tablero[2]=new Casilla(3, "Pez", null, 0, "");
		tablero[3]=new Casilla(4, "Payaso", null, 0, "");
		tablero[4]=new Casilla(5, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[5]=new Casilla(6, "Puente", null, 0, "De puente a puente y tiro porque me da la corriente");
		tablero[6]=new Casilla(7, "Tortuga", null, 0, "");
		tablero[7]=new Casilla(8, "Silla", null, 0, "");
		tablero[8]=new Casilla(9, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[9]=new Casilla(10, "Raton", null, 0, "");
		tablero[10]=new Casilla(11, "Rana", null, 0, "");
		tablero[11]=new Casilla(12, "Puente", null, 0, "De puente a puente y tiro porque me da la corriente");
		tablero[12]=new Casilla(13, "Pollo", null, 0, "");
		tablero[13]=new Casilla(14, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[14]=new Casilla(15, "Helado", null, 0, "");
		tablero[15]=new Casilla(16, "Oso", null, 0, "");
		tablero[16]=new Casilla(17, "Bebé", null, 0, "");
		tablero[17]=new Casilla(18, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[18]=new Casilla(19, "Posada", null, 0, "");
		tablero[19]=new Casilla(20, "Cohete", null, 0, "");
		tablero[20]=new Casilla(21, "Tarta", null, 0, "");
		tablero[21]=new Casilla(22, "Casa", null, 0, "");
		tablero[22]=new Casilla(23, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[23]=new Casilla(24, "Florero", null, 0, "");
		tablero[24]=new Casilla(25, "León", null, 0, "");
		tablero[25]=new Casilla(26, "Dados", null, 0, "");
		tablero[26]=new Casilla(27, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[27]=new Casilla(28, "Bicicleta", null, 0, "");
		tablero[28]=new Casilla(29, "Delfín", null, 0, "");
		tablero[29]=new Casilla(30, "Dinosaurio", null, 0, "");
		tablero[30]=new Casilla(31, "Pozo", null, 0, "");
		tablero[31]=new Casilla(32, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[32]=new Casilla(33, "Mariposa", null, 0, "");
		tablero[33]=new Casilla(34, "Moto", null, 0, "");
		tablero[34]=new Casilla(35, "Peluche", null, 0, "");
		tablero[35]=new Casilla(36, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[36]=new Casilla(37, "Elefante", null, 0, "");
		tablero[37]=new Casilla(38, "Ciervo", null, 0, "");
		tablero[38]=new Casilla(39, "Conejo", null, 0, "");
		tablero[39]=new Casilla(40, "Frutas", null, 0, "");
		tablero[40]=new Casilla(41, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[41]=new Casilla(42, "Laberinto", null, 0, "");
		tablero[42]=new Casilla(43, "Jarrón", null, 0, "");
		tablero[43]=new Casilla(44, "Paraguas", null, 0, "");
		tablero[44]=new Casilla(45, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[45]=new Casilla(46, "Conejo", null, 0, "");
		tablero[46]=new Casilla(47, "Muñeco de nieve", null, 0, "");
		tablero[47]=new Casilla(48, "Mariposa", null, 0, "");
		tablero[48]=new Casilla(49, "Tren", null, 0, "");
		tablero[49]=new Casilla(50, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[50]=new Casilla(51, "Pajaro", null, 0, "");
		tablero[51]=new Casilla(52, "Carcel", null, 0, "");
		tablero[52]=new Casilla(53, "Dados", null, 0, "");
		tablero[53]=new Casilla(54, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[54]=new Casilla(55, "Arbol", null, 0, "");
		tablero[55]=new Casilla(56, "Tiburon", null, 0, "");
		tablero[56]=new Casilla(57, "Perro", null, 0, "");
		tablero[57]=new Casilla(58, "Muerte", null, 0, "Has muerto");
		tablero[58]=new Casilla(59, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		tablero[59]=new Casilla(60, "Mariposa", null, 0, "");
		tablero[60]=new Casilla(61, "Demoni", null, 0, "");
		tablero[61]=new Casilla(62, "Regador", null, 0, "");
		tablero[62]=new Casilla(63, "Oca", null, 0, "¡Has ganado!");
	
		
		
		// Destinos de las casillas especiales
		tablero[4].setDestino(tablero[8]); // Oca
		tablero[5].setDestino(tablero[11]); // Puente
		tablero[11].setDestino(tablero[5]); // Puente
		tablero[8].setDestino(tablero[13]);// Oca
		tablero[13].setDestino(tablero[17]);// Oca
		tablero[17].setDestino(tablero[22]);// Oca
		tablero[22].setDestino(tablero[26]);// Oca
		tablero[25].setDestino(tablero[52]);// Dado
		tablero[52].setDestino(tablero[25]);// Dado
		tablero[26].setDestino(tablero[31]);// Oca
		tablero[31].setDestino(tablero[35]);// Oca 
		tablero[35].setDestino(tablero[40]);// Oca 
		tablero[40].setDestino(tablero[44]);// Oca 
		tablero[41].setDestino(tablero[29]);// Laberinto 
		tablero[44].setDestino(tablero[49]);// Oca 
		tablero[49].setDestino(tablero[53]);// Oca 
		tablero[53].setDestino(tablero[58]);// Oca 
		tablero[57].setDestino(tablero[0]);// Muerte 
		tablero[58].setDestino(tablero[62]);// Oca 	
				
		
	}
	public void imprimeTablero () {
		//Imprimir el tablero
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(tablero[i].getOrden() + " - " + tablero[i].getNombre());
		
			}
		}

	
		


}
