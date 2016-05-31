package chapter4;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Asset
 * Date: 2016-06-01
 * Time: 오전 12:16
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Asset {
    private final AssetType type;

    ;
    private final int value;
    public Asset(final AssetType assetType, final int assetValue) {
        type = assetType;
        value = assetValue;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public enum AssetType {BOND, STOCK}
}
