package main;

import provider.NasaDataProvider;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Lidia on 14.03.2020.
 */
public class Application {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start & end dates in YYYY-MM-DD");
        String start = in.next(), end = in.next();
        new NasaDataProvider().getNeoAsteroids(start, end);
    }
}
