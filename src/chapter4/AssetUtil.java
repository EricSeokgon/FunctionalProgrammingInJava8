package chapter4;

import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: AssetUtil
 * Date: 2016-06-02
 * Time: 오전 12:12
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AssetUtil {
    public static int totalAssetValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(Asset::getValue)
                .sum();
    }

    public static int totalBondValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset ->
                        asset.getType() == Asset.AssetType.BOND ? asset.getValue() : 0)
                .sum();
    }

    public static int totalStockValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(asset ->
                        asset.getType() == Asset.AssetType.STOCK ? asset.getValue() : 0)
                .sum();
    }

    public static void main(final String[] args) {
        final List<Asset> assets = Arrays.asList(
                new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000)
        );

        System.out.println("//" + "START:TOTAL_ALL_OUTPUT");
        System.out.println("Total of all assets: " + totalAssetValues(assets));
        System.out.println("//" + "END:TOTAL_ALL_OUTPUT");

        System.out.println("//" + "START:TOTAL_BONDS_OUTPUT");
        System.out.println("Total of bonds: " + totalBondValues(assets));
        System.out.println("//" + "END:TOTAL_BONDS_OUTPUT");

        System.out.println("//" + "START:TOTAL_STOCKS_OUTPUT");
        System.out.println("Total of stocks: " + totalStockValues(assets));
        System.out.println("//" + "END:TOTAL_STOCKS_OUTPUT");
    }
}
