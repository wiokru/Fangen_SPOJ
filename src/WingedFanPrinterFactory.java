import enums.FanPrinterType;
import enums.WingType;

public class WingedFanPrinterFactory {

    public static WingedFanPrinter getWingedFanPrinter (FanPrinterType type) {

        WingPainter painter = WingPainterFactory.getWingPainter(WingType.AsteriskTriangle);
        CharMap wingMap = painter.GetWingMap();

        if (type == FanPrinterType.QuadrupleSymmetry) {
            return new WingedFanPrinterQuadrupleSymmetry(wingMap);
        }
        throw new IllegalArgumentException("Illegal enums.FanPrinterType: " + type);
    }
}
