/*
 * @Author: your name
 * @Date: 2015-05-11 00:00:00
 * @LastEditTime: 2022-02-25 17:57:26
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \{0}--全部课件\ch06\ExceptionCause.java
 */
public class ExceptionCause {
	public static void main(String [] args)	{
		try 
		{
			BankATM.GetBalanceInfo( 12345L);
		}catch(Exception e)	{
			System.out.println("something wrong�� " + e);
			System.out.println("cause��" + e.getCause());
		}
	}
}

class DataHouse {
	public static void FindData( long ID)
		throws DataHouseException
	{
		if( ID>0 && ID<1000)
			System.out.println( "id: " + ID );
		else
			throw new DataHouseException("cannot find the id");
	}
}
class BankATM{
	public static void GetBalanceInfo( long  ID)
		throws MyAppException
	{
		try 
		{
			DataHouse.FindData(ID);
		}catch (DataHouseException e) {
			throw new MyAppException("invalid id",e);
		}
	}
}
class DataHouseException extends Exception {
	public DataHouseException( String message ) {
		super(message);
	}
}
class MyAppException extends Exception {
	public MyAppException (String message){ 
		super (message); 
	}
	public MyAppException (String message, Exception cause) {
		super(message,cause);
	}   
}
