import java.io.*;
import javax.script.*;

public class JSDemo
{
	public static void main(String args[]) throws Exception
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");	

		//engine.eval("print('Hello')");
		engine.eval(new FileReader("demo.js"));

		Invocable inv = (Invocable) engine;

		inv.invokeFunction("abc");
		inv.invokeFunction("xyz");
		inv.invokeFunction("abc");

		inv.invokeFunction("addNumbers", 10, 20);

		String result = (String) inv.invokeFunction("multiply", 10, 20);
		System.out.println(result);
	}
}