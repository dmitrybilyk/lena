package com.lena.learn.exceptions.dima.threads.incremenator.withInterruptMethod;

class Incremenator extends Thread
{
	private volatile boolean mIsIncrement = true;

	public void changeAction()	//Меняет действие на противоположное
	{
		mIsIncrement = !mIsIncrement;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 100000000; i++) {
			if (!Thread.interrupted()) {
				System.out.println("dddd");
			} else {
				break;
			}
		}
//		do
//		{
//			if(!Thread.interrupted())	//Проверка прерывания
//			{
//				if(mIsIncrement) Program.mValue++;	//Инкремент
//				else Program.mValue--;			//Декремент
//
//				//Вывод текущего значения переменной
//				System.out.print(Program.mValue + " ");
//			}
//			else
//				return;		//Завершение потока
//
//			try{
//				Thread.sleep(1000);		//Приостановка потока на 1 сек.
//			}catch(InterruptedException e){
//				return;	//Завершение потока после прерывания
//			}
//		}
//		while(true);
		System.out.println("ddfff");
	}
}