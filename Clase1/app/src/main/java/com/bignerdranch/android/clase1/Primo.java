package com.bignerdranch.android.clase1;

public class Primo {
    private int n;

    public Primo(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int cde(){
        int c = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
            }
        }
        return c;
    }

    public boolean esPrimo(){
        if (cde() == 1 && n > 1) {
            return true;
        } else {
            return false;
        }
    }

}
