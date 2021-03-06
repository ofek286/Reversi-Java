package reversi.gui;

import java.util.ArrayList;
import javafx.scene.image.Image;
/**
 * Names: Natalie Elisha and Ofek Segal.
 * IDs: 209475458, 315638288
 */
public enum XDiskColor {
    Black {
        /**
         * The function returns the toString version
         * of Black object
         * @return a string
         */
        @Override
        public String toString() {
            return "Black";
        }
    },
    TedMosby {
        /**
         * The function returns the toString version
         * of TedMosby object
         * @return a string
         */
        @Override
        public String toString() {
            return "Ted Mosby";
        }
    },
    BarneyStinson {
        /**
         * The function returns the toString version
         * of BarneyStinson object
         * @return a string
         */
        @Override
        public String toString() {
            return "Barney Stinson";
        }
    },
    LilyAldrin {
        /**
         * The function returns the toString version
         * of LilyAldrin object
         * @return a string
         */
        @Override
        public String toString() {
            return "Lily Aldrin";
        }
    },
    MarshallErikson {
        /**
         * The function returns the toString version
         * of MarshallErikson object
         * @return a string
         */
        @Override
        public String toString() {
            return "Marshall Erikson";
        }
    },
    RobinScherbatsky {
        /**
         * The function returns the toString version
         * of RobinScherbatsky object
         * @return a string
         */
        @Override
        public String toString() {
            return "Robin Scherbatsky";
        }
    },
    YellowUmbrella {
        /**
         * The function returns the toString version
         * of YellowUmbrella object
         * @return a string
         */
        @Override
        public String toString() {
            return "Yellow Umbrella";
        }
    },
    BlueFrenchHorn {
        /**
         * The function returns the toString version
         * of BlueFrenchHorn object
         * @return a string
         */
        @Override
        public String toString() {
            return "Blue French Horn";
        }
    },
    PurpleFlower {
        /**
         * The function returns the toString version
         * of PurpleFlower object
         * @return a string
         */
        @Override
        public String toString() {
            return "Purple Flower";
        }
    },
    CPU {
        /**
         * The function returns the toString version
         * of CPU object
         * @return a string
         */
        @Override
        public String toString() {
            return "CPU";
        }
    },
    JavaLogo {
        /**
         * The function returns the toString version
         * of JavaLogo object
         * @return a string
         */
        @Override
        public String toString() {
            return "Java Logo";
        }
    };
    
    /**
     * The function returns the image of the x disk
     * @return an image
     */
    public Image getDisk() {
        switch (this) {
            case Black:             return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlackDisk.png"));
            case TedMosby:          return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/TedMosbyBlackDisk.png"));
            case BarneyStinson:     return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BarneyStinsonBlackDisk.png"));
            case LilyAldrin:        return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/LilyAldrinBlackDisk.png"));
            case MarshallErikson:   return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/MarshallEriksonBlackDisk.png"));
            case RobinScherbatsky:  return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/RobinScherbatskyBlackDisk.png"));
            case YellowUmbrella:    return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/YellowUmbrellaBlackDisk.png"));
            case BlueFrenchHorn:    return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlueFrenchHornBlackDisk.png"));
            case PurpleFlower:      return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/PurpleFlowerBlackDisk.png"));
            case CPU:               return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/CPUBlackDisk.png"));
            case JavaLogo:          return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/JavaLogoBlackDisk.png"));
            
            default:                return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlackDisk.png"));
        }
    }
    
    /**
     * The function returns the image of the x cell
     * @return an image
     */
    public Image getCell() {
        switch (this) {
            case Black:             return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlackDiskCell.png"));
            case TedMosby:          return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/TedMosbyBlackDiskCell.png"));
            case BarneyStinson:     return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BarneyStinsonBlackDiskCell.png"));
            case LilyAldrin:        return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/LilyAldrinBlackDiskCell.png"));
            case MarshallErikson:   return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/MarshallEriksonBlackDiskCell.png"));
            case RobinScherbatsky:  return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/RobinScherbatskyBlackDiskCell.png"));
            case YellowUmbrella:    return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/YellowUmbrellaBlackDiskCell.png"));
            case BlueFrenchHorn:    return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlueFrenchHornBlackDiskCell.png"));
            case PurpleFlower:      return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/PurpleFlowerBlackDiskCell.png"));
            case CPU:               return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/CPUBlackDiskCell.png"));
            case JavaLogo:          return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/JavaLogoBlackDiskCell.png"));
            
            default:                return new Image(getClass().getClassLoader().getResourceAsStream("reversi/gui/res/BlackDiskCell.png"));
        }
    }
    
    /**
     * The function returns the enum that's bound
     * to the given string
     * @param s - a string
     * @return XDiskColor enum
     */
    public static XDiskColor getEnum(String s) {
        switch (s) {
            case "Black":               return Black;
            case "Ted Mosby":           return TedMosby;
            case "Barney Stinson":      return BarneyStinson;
            case "Lily Aldrin":         return LilyAldrin;
            case "Marshall Erikson":    return MarshallErikson;
            case "Robin Scherbatsky":   return RobinScherbatsky;
            case "Yellow Umbrella":     return YellowUmbrella;
            case "Blue French Horn":    return BlueFrenchHorn;
            case "Purple Flower":       return PurpleFlower;
            case "CPU":                 return CPU;
            case "Java Logo":           return JavaLogo;
            
            default:                    return Black;
        }
    }
    
    /**
     * The function returns all of the strings
     * that represent a kind of disk
     * @return an array list of strings
     */
    public static ArrayList<String> getStrings() {
        XDiskColor[] colors = XDiskColor.values();
        ArrayList<String> toReturn = new ArrayList<>();
        for (XDiskColor color : colors) {
            toReturn.add(color.toString());
        }
        return toReturn;
    }
}
