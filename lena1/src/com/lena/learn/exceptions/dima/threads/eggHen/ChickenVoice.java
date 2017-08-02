package com.lena.learn.exceptions.dima.threads.eggHen;

public class ChickenVoice	//Класс с методом main()
{
	public ChickenVoice() {

	}

	static EggVoice mAnotherOpinion;	//Побочный поток
	
	public static void main(String[] args)
	{
		mAnotherOpinion = new EggVoice();	//Создание потока
//		mAnotherOpinion.setDaemon(true);
		System.out.println("Спор начат...");
		mAnotherOpinion.start(); 			//Запуск потока
		
//		for(int i = 0; i < 3; i++)
//		{
			try{
				Thread.sleep(1000);
					mAnotherOpinion.interrupt();//Приостанавливает поток на 1 секунду
			}catch(InterruptedException e){}

//			System.out.println("курица!");
//		}
		
		//Слово «курица» сказано 5 раз

//		if(mAnotherOpinion.isAlive())	//Если оппонент еще не сказал последнее слово
//		{
//			try{
//				mAnotherOpinion.join();	//Подождать пока оппонент закончит высказываться.
//			}catch(InterruptedException e){}
			
//			System.out.println("Первым появилось яйцо!");
//		}
//		else	//если оппонент уже закончил высказываться
//		{

//		}
		System.out.println("Спор закончен!");	
	}
}