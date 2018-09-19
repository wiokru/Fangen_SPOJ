public class WingPainterFactory {

    public static WingPainter getWingPainter (WingType type) {

        if (type == WingType.AsteriskTriangle)
            return new WingPainterAsterisk();
        throw new IllegalArgumentException("Illegal WingType: " + type);
    }
}
