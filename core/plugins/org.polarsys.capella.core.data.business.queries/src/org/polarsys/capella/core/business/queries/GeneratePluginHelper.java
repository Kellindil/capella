package org.polarsys.capella.core.business.queries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.polarsys.capella.common.queries.ExtendingQuery;
import org.polarsys.capella.common.queries.IQuery;
import org.polarsys.capella.common.queries.QuerySchema;

class GeneratePluginHelper {
  public static void main(String[] args) {

    System.out.println("init"); //$NON-NLS-1$
    for (Class clazz : getClasses("org.polarsys.capella.core.business.queries", IBusinessQuery.class)) { //$NON-NLS-1$
      System.out.println("<MDEBusinessQueries class=\"" + clazz.getName() + "\" />"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    for (Class clazz : getClasses("org.polarsys.capella.core.business.queries.queries", IQuery.class)) { //$NON-NLS-1$
      String extendedQueryIdentifier = ""; //$NON-NLS-1$
      ExtendingQuery annotation = (ExtendingQuery) clazz.getAnnotation(ExtendingQuery.class);
      if (annotation != null) {
        extendedQueryIdentifier = " extendedQueryIdentifier=\"" + QuerySchema.getQueryIdentifier(annotation.extendingQuery()) + "\""; //$NON-NLS-1$ //$NON-NLS-2$
      }
      System.out.println("    <querySpecification queryIdentifier=\"" + QuerySchema.getQueryIdentifier(clazz) + "\""+extendedQueryIdentifier+">\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          + "      <queryAlgorithm algorithm=\"" + clazz.getName() + "\" />\r\n" + "    </querySpecification>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    System.out.println();

  }

  public static Collection<Class> getClasses(String packageName, Class instance) {
    Collection<Class> queries = new ArrayList<>();
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    String path = packageName.replace('.', '/');
    try {
      File folder = new File(classLoader.getResources(path).nextElement().getFile());
      for (File s : folder.listFiles()) {
        if (s.isDirectory()) {
          for (File s2 : s.listFiles()) {
            if (s2.getName().endsWith(".class")) { //$NON-NLS-1$
              String sss = s2.getAbsolutePath().substring(s2.getAbsolutePath().indexOf("bin\\") + 4) //$NON-NLS-1$
                  .replaceAll("\\\\", ".").replace(".class", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
              try {
                Class query = classLoader.loadClass(sss);
                if (instance.isAssignableFrom(query)) {
                  queries.add(query);
                }
              } catch (ClassNotFoundException e) {
                e.printStackTrace();
              }
            }
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return queries;
  }
}
