package kotlin;

public class KotlinVersion {
    public static final KotlinVersion CURRENT = new KotlinVersion(0, 0, 1);

    public final int major;
    public final int minor;
    public final int patch;

    public KotlinVersion(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    @Override
    public String toString() {
        return "io.vproxy:kotlin-stdlib-lite:" + major + "." + minor + "." + patch;
    }
}
