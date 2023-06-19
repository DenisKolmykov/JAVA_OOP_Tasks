package less_OOP_07_Decorator_Factory_Observer;
/*
 * создание класса при выполнении программы
 * и автоматическое изменение структуры кода
 * 
 В данном примере мы создаем исходный код класса DynamicClass в виде строки sourceCode. 
 Затем мы записываем этот исходный код во временный файл с расширением .java. 
 Далее, мы используем JavaCompiler для компиляции файла и ClassLoader для загрузки класса в память.

После загрузки класса, мы можем создать экземпляр класса и вызвать его методы, 
как и в любом другом классе.

Обратите внимание, что создание классов налету с использованием рефлексии и компилятора 
во время выполнения является сложным процессом и может иметь ограничения в определенных средах выполнения.
Поэтому рекомендуется внимательно изучить соответствующую документацию и обратиться к специалистам, 
если у вас возникнут специфические требования или вопросы.
 */

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;


public class less_oop_07_seminar_Class_create {
    public static void main(String[] args) throws Exception {
        String className = "DynamicClass";
        String sourceCode = "public class DynamicClass { public void sayHello() { System.out.println(\"Hello, dynamic class!\"); } }";
        
        // Записываем исходный код в файл
        String fileName = className + ".java";
        File sourceFile = new File(fileName);
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(sourceCode);
        writer.close();
        
        // Компилируем и загружаем класс
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, fileName);
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> dynamicClass = classLoader.loadClass(className);
        
        // Создаем экземпляр класса и вызываем его метод
        Object instance = dynamicClass.newInstance();
        Method method = dynamicClass.getMethod("sayHello");
        method.invoke(instance);
        
        // Удаляем временный файл
        sourceFile.delete();
    }
}
