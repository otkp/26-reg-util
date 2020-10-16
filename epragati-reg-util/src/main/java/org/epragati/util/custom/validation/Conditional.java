package org.epragati.util.custom.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Repeatable(Conditionals.class)
//{ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE }
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)

@Constraint(validatedBy = { ConditionalValidator.class })

public @interface Conditional {
	String message() default "This field is required.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String selected();

	String[] values();

}
