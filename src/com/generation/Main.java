package com.generation;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	String universidades[];
	universidades = new String[5];
	universidades[0]="ITVH";
	universidades[1]="ULA";
	universidades[2]="UAM";
	universidades[3]="UNADM";
	universidades[4]="UNAM";


	//Forma abreviada para declara un arreglo
	String universidades2[]=new String[]{"ITVH","ULA","UAM","UNADM","UNAM"};
	/*for (String universidad : universidades) {
		System.out.println(universidad);
	}*/


    Set<String> frutas=new HashSet(4);
		//Caracteristicas del Set
		//No puede tener elemtos
	frutas.add("Mango");
	frutas.add("Fresa");
	frutas.add("Pera");
	frutas.add("Uva");
	frutas.add("Melon");
	frutas.add("Lima");
	frutas.add("Mango");

	for (String fruta : frutas){
		System.out.println(fruta);
	}

	System.out.println("========================================================");
	System.out.println("Implementación con TreeSet \n " +
				"este ordena los elementos alfabéticamente");
	Set<String> frutas2=new TreeSet<>();
	frutas2.add("Mango");
	frutas2.add("Fresa");
	frutas2.add("Pera");
	frutas2.add("Uva");
	frutas2.add("Melon");
	frutas2.add("Lima");

	for (String fruta : frutas2){
		System.out.println(fruta);
	}

	System.out.println("=============================================");

	System.out.println("Implementación con LinkedHashSet \n " +
				"esta implementación respeta el orden de aparición");

	Set<String> frutas3=new LinkedHashSet<>(4);
	frutas3.add("Mango");
	frutas3.add("Fresa");
	frutas3.add("Pera");
	frutas3.add("Uva");
	frutas3.add("Melon");
	frutas3.add("Lima");

	for (String fruta : frutas3){
		System.out.println(fruta);
	}


	System.out.println("====================================");
	/*System.out.println("Sergio Borjon");
	final Set hashSet = new HashSet(1_000_000);
	final Long startHashSetTime = System.currentTimeMillis();
	for (int i = 0; i < 1_000_000;i++) {
		hashSet.add(i);
	}
	final Long endHashSetTime = System.currentTimeMillis();
	System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

	final Set treeSet = new TreeSet();
	final Long startTreeSetTime = System.currentTimeMillis();
	for (int i = 0; i < 1_000_000;i++) {
		treeSet.add(i);
	}
	final Long endTreeSetTime = System.currentTimeMillis();
	System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

	final Set linkedHashSet = new LinkedHashSet(1_000_000);
	final Long startLinkedHashSetTime = System.currentTimeMillis();
	for (int i = 0; i < 1_000_000;i++) {
		linkedHashSet.add(i);
	}
	final Long endLinkedHashSetTime = System.currentTimeMillis();
	System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));*/

		System.out.println("==============================================");
		//Implementación de colecciones con List
		//Este si permite poner elementos repetidos y buscar con índices
		//Repetir elementos
		//Agregar elementos en posiciones específicas

	List<String> frutas4=new ArrayList<>();
	frutas4.add("Mango");
	frutas4.add("Fresa");
	frutas4.add("Pera");
	frutas4.add("Uva");
	frutas4.add("Melon");
	frutas4.add("Lima");
	frutas4.add("Lima");

	for (String elemento :frutas4){
		System.out.println(elemento);
	}

	System.out.println(frutas4.get(2));
	int indice=frutas4.indexOf("Melon");
	System.out.println(frutas4.get(indice));


	System.out.println("==============================");
	System.out.println("LinkedList");
	/*Este entorno hace funciones similares al ArrayList pero se
	conoce como una lista doblemente enlazada esto tiene como
	efecto que cada elemento sabe cuál tiene adelante y atrás */

		List<String> frutas5=new LinkedList<>();
		frutas5.add("Mango");
		frutas5.add("Fresa");
		frutas5.add("Uva");
		frutas5.add("Uva");
		frutas5.add("Uva");

	int index=frutas5.indexOf("Uva");
	System.out.println(index);
	System.out.println(frutas5.get(index));

	Map<Integer,String> universidades3=new HashMap<Integer, String>();
	/*Asocia valores con claves, no puede tener claves repetidas, y solo se asocia a un elemento*/
	universidades3.put(1,"IPN");
	universidades3.put(2,"UNAM");
	universidades3.put(3, "UAEM");
	universidades3.put(4,"UAEM");
	universidades3.put(5,"TESCO");

	System.out.println(universidades3.get(3));

	for (Map.Entry<Integer, String> universidad : universidades3.entrySet()){
		System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
		}

	}
}
