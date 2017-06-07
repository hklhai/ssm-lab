package cn.edu.ncut.generate;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Ocean Lin on 2017/6/7.
 */
public class GenTable {


    private String SCHEMA = "hk";


    @Test
    public void test() {
        File file = new File("src/test/resources/table.info");
        String s = txt2String(file);
        System.out.println(s);
        String[] split = s.split("\r\n");
        for (int i = 1; i < split.length; i++) {

            String tabName = split[i];
            String s1 = tabName.split("_")[1];
            String name =s1.substring(0, 1).toUpperCase()+s1.substring(1);
            String objName = name+"Obj";
            String daoName = name+"Dao";

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<table schema=\"");
            stringBuilder.append(SCHEMA);
            stringBuilder.append("\" tableName=\"");
            stringBuilder.append(tabName);
            stringBuilder.append("\" domainObjectName=\"");
            stringBuilder.append(objName);//实体类
            stringBuilder.append("\" mapperName=\"");
            stringBuilder.append(daoName);
            stringBuilder.append("\" sqlProviderName=\"");
            stringBuilder.append(daoName);
            stringBuilder.append("\" enableCountByExample=\"false\" enableUpdateByExample=\"false\"\n" +
                    "    enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\"></table>");
            System.out.println(stringBuilder.toString());
        }

    }

    public static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

}
