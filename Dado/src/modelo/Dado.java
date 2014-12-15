package modelo;

import java.util.Arrays;
import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	
	public void realizarTest(int numerotiradas) {
		for(;numerotiradas>0;numerotiradas--){
			Random random = new Random();
			cara = random.nextInt(6) + 1;
			if(cara==1) testAleatorio[1]+=1;
			if(cara==2) testAleatorio[2]+=1;
			if(cara==3) testAleatorio[3]+=1;
			if(cara==4) testAleatorio[4]+=1;
			if(cara==5) testAleatorio[5]+=1;
			if(cara==6) testAleatorio[6]+=1;
			}
		}
	public void print(){
		System.out.println(Arrays.toString(testAleatorio));
	}
	}


