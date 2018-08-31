package Erasure;

import java.util.List;

public class OverLoad_Exception_Issue/*<T>*/ extends Exception {

    public void fireException(String param) {
        try {
            throw new OverLoad_Exception_Issue();
        } catch (OverLoad_Exception_Issue/*<T>*/ overLoad_exception_issue) {
            overLoad_exception_issue.printStackTrace();
        }
    }

    public void overLoadMethod(Integer param) {

    }

    public void overLoadMethod(List<String> param) {

    }
//
//    public void overLoadMethod(List<Integer> param)
//    {
//
//    }
}
