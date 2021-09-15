import util.CupDrawImpl;

import java.util.logging.Logger;

public class Runner {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());
    private static CupDrawImpl cupDraw = new CupDrawImpl();

    public static void main(String[] args) {
        logger.info("Begin Cup Draw..");
        cupDraw.executeDraw();
        logger.info("Cup Draw Concluded..");
    }
}
