package com.tomspencerlondon.arrays.jump;

public class Main {

    public static void main(String[] args) {
        JumpDmitriTom jumpDmitriTom = new JumpDmitriTom();
        int[] nums = new int[]{6,2,6,1,7,9,3,5,3,7,2,8,9,4,7,7,2,2,8,4,6,6,1,3};
        System.out.println(jumpDmitriTom.jump(nums));
    }
}
