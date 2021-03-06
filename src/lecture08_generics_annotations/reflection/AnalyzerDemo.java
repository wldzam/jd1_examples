package lecture08_generics_annotations.reflection;

import lecture08_generics_annotations.annotations.Transactional;

/**
 * Class AnalyzerDemo
 *
 * Created by yslabko on 05/23/2018.
 */
public class AnalyzerDemo {
    public static void main(String[] args) {
        ClassAnalyzer.analyzeClass(AnalyzerDemo.class);
    }

    public void play(){
        System.out.println("Play");
    }

    @Transactional
    public void singSong() {
        System.out.println("Singing");
    }
}
