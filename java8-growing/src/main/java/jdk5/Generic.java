package jdk5;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛型
 *
 * @author GaoHangHang
 * @date 2018/05/18 16:19
 **/
public class Generic<T> {

    public T getById(Integer id){
        return null;
    }

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        Generic<Long> generic = new Generic<>();

    }

}
