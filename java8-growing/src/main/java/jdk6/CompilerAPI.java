package jdk6;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

/**
 * 使用Compiler API
 *
 * @author GaoHangHang
 * @date 2018/05/18 16:35
 **/
public class CompilerAPI {

    public static void main(String[] args) {
        String program = "" +
                "public class LearnJava6 {\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(\"欢迎你学习跟上 Java 8 之 CompilerAPI!\");\n" +
                "  }\n" +
                "}\n";

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

//        JavaFileObject compilationUnit = new StringJavaFileObject("LearnJava6", program);
    }

}
