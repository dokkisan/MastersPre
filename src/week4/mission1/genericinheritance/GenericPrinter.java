package week4.mission1.genericinheritance;

public class GenericPrinter<T extends Material> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 " + material.toString() + "입니다.";
    }
}
