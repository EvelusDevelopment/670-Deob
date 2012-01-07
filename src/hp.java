import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;

final class hp {

   static int h;
   static int a;
   static int b;
   static int d;
   static int j;
   static Calendar e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   static int g;
   static int f_i;
   static int c;
   static int f;


   static final Object[] a(byte var0, Object[] var1, int var2, Object[] var3, int var4, Object[] var5, Object[] var6, int var7) {
      ++g;
      if(var3[1] == null) {
         var3[1] = new int[6];
      }

      np.a(1, var6, var5, '\u806f', var3, var1, false, var7 * var4 * var2);
      ((int[])((int[])var3[1]))[4] = var4;
      ((int[])((int[])var3[1]))[3] = var7;
      ((int[])((int[])var3[1]))[5] = var2;
      moa.a((byte)112, var3, (Object[])((Object[])var3[4]));
      OpenGL.glTexImage3Dub(((int[])((int[])var3[1]))[2], 0, bu.a(90, (Object[])((Object[])var3[5]), (Object[])((Object[])var3[2])), ((int[])((int[])var3[1]))[3], ((int[])((int[])var3[1]))[4], ((int[])((int[])var3[1]))[5], 0, rha.b(8, (Object[])((Object[])var3[2])), 5121, (byte[])null, 0);
      gg.a((byte)-50, var3, true);
      return var0 != 2?(Object[])null:var3;
   }

   static final int a(String var0, int var1) {
      ++d;
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var2 > var4; ++var4) {
         var3 = so.a((byte)-102, var0.charAt(var4)) + -var3 + (var3 << 5);
      }

      if(var1 != 1) {
         e = (Calendar)null;
      }

      return var3;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      if(var2 != 27468) {
         a((String)null, ((int[])((int[])var1[6]))[1]);
      }

      var1[0] = var0;
      ++j;
      return var1;
   }

   static final boolean a(int var0, int var1, int var2) {
      ++h;
      boolean var3 = false;
      int var4 = 122 % ((52 - var1) / 53);
      boolean var5 = var3;
      if(!var3) {
         boolean var7 = false;
         boolean var9 = -1 != ~(2048 & var2);
         boolean var6 = var9 & var7;
         var5 = var6;
      }

      return var5;
   }

   static final int a(Object[] var0, byte var1) {
      ++f_i;
      if(var1 != -26) {
         ((int[])((int[])var0[0]))[16] = ((int[])((int[])var0[10]))[4];
      }

      return ((int[])((int[])var0[5]))[4];
   }

   static final void a(za var0, boolean var1, Object[] var2) {
      ++c;
      if(var1) {
         ((byte[])((byte[])var2[1]))[3] = 6;
      }

      fha var3;
      var2[46] = ((var3 = (fha)var0) != null?var3.p:null)[0];
   }

   static final boolean a(byte var0, String var1) {
      ++a;
      if(var0 >= -3) {
         f = -123;
      }

      Class var3 = bsa.class;
      Class var4 = (Class)it.c.get(var1);
      boolean var2;
      if(null != var4) {
         if(var4.getClassLoader() != var3.getClassLoader()) {
            var2 = false;
         } else {
            var2 = true;
         }
      } else {
         File var5 = null;
         if(var5 == null) {
            var5 = (File)nua.d.get(var1);
         }

         if(var5 != null) {
            try {
               var5 = new File(var5.getCanonicalPath());
               Class var6 = Class.forName("java.lang.Runtime");
               Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
               Method var8 = var7.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
               Method var9 = var6.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
               var8.invoke(var9, new Object[]{Boolean.TRUE});
               var9.invoke(Runtime.getRuntime(), new Object[]{var3, var5.getPath()});
               var8.invoke(var9, new Object[]{Boolean.FALSE});
               it.c.put(var1, var3);
               var2 = true;
               return var2;
            } catch (NoSuchMethodException var10) {
               System.load(var5.getPath());
               it.c.put(var1, bsa.class);
               var2 = true;
               return var2;
            } catch (Throwable var11) {
               ;
            }
         }

         var2 = false;
      }

      return var2;
   }

   static final boolean a(int var0, Object[] var1, int var2) {
      try {
         ++b;
         if(ev.a((int)4120, var1)) {
            if(var0 > -123) {
               return true;
            } else if(1 != ((int[])((int[])((Object[])((Object[])var1[3]))[5])).length) {
               if(sda.a(var2, var1, 107)) {
                  if(1 != ((int[])((int[])((Object[])((Object[])var1[3]))[5]))[var2]) {
                     throw new RuntimeException();
                  } else {
                     return Class_ss.a(0, 5, var1, var2);
                  }
               } else {
                  return false;
               }
            } else {
               return Class_ss.a(var2, 5, var1, 0);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "hp.F(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

}
