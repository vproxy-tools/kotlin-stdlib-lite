package kotlin;

public @interface Metadata {
    int k() default 1;

    int[] mv() default {};

    int[] bv() default {1, 0, 3};

    String[] d1() default {};

    String[] d2() default {};

    String xs() default "";

    String pn() default "";

    int xi() default 0;
}
