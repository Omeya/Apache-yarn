package org.apache.hadoop.classification;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
025     * Annotation to inform users of how much to rely on a particular package,
026     * class or method not changing over time.
027     * </ul>
028     */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class InterfaceStability {
/**
* Can evolve while retaining compatibility for minor release boundaries.; 
* can break compatibility only at major release (ie. at m.0).
*/
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Stable {};

/**
041       * Evolving, but can break compatibility at minor release (i.e. m.x)
042       */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Evolving {};

/**
048       * No guarantee is provided as to reliability or stability across any
049       * level of release granularity.
050       */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Unstable {};
}