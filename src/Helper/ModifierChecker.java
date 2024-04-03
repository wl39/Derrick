package Helper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModifierChecker {
    public static String getModifier(Class targetClass, String toCheck) {
        try {
            Field field = targetClass.getDeclaredField(toCheck);
            int modifier = field.getModifiers();
            return Modifier.toString(modifier);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
