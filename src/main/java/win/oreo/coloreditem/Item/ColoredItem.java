package win.oreo.coloreditem.Item;

import org.bukkit.Material;

public class ColoredItem {
    private Material material;
    private String name;

    private String hexCode;

    public ColoredItem(Material material, String name, String hexCode) {
        this.material = material;
        this.name = name;
        this.hexCode = hexCode;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }
}
