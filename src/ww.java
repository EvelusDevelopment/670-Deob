import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class ww extends gv {

   static int f_l;
   static int o;
   static int s;
   static int A;
   static int u;
   static int v;
   static int r;
   static int q;
   static int w;
   static int z;
   static int p;
   static int x;
   Object[] m;
   static int t;
   static int n;
   static int k;
   static int B;
   static int y;


   final int a(int var1, int var2) {
      ++u;
      return jha.a(var1, var2, false, this.m);
   }

   final boolean b() {
      ++o;
      return jla.a((int)-29005, this.m);
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2, int var3) {
      aua.a(var0, 97);
      ++B;
      var0[var3] = var1;
      ((int[])((int[])var0[1]))[0] = var2;
      return var0;
   }

   final int d() {
      ++t;
      Object[] var2 = this.m;
      int var1;
      if(var2 != null && -9 == ~var2.length) {
         int var3 = ((int[])((int[])var2[2]))[1];
         var1 = var3;
      } else {
         if(var2 == null || 6 != var2.length) {
            throw new IllegalStateException();
         }

         var1 = tsa.a(var2, true);
      }

      return var1;
   }

   final void a(int var1) throws Throwable {
      ++n;
      if(var1 != 27142) {
         this.m = (Object[])null;
      }

      super.finalize();
   }

   static final boolean b(byte var0) {
      ++k;
      Hashtable var1 = new Hashtable();
      Enumeration var2 = it.c.keys();

      while(var2.hasMoreElements()) {
         Object var3 = var2.nextElement();
         var1.put(var3, it.c.get(var3));
      }

      try {
         Class var24 = Class.forName("java.lang.reflect.AccessibleObject");
         Class var4 = Class.forName("java.lang.ClassLoader");
         Field var5 = var4.getDeclaredField("nativeLibraries");
         Method var6 = var24.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
         var6.invoke(var5, new Object[]{Boolean.TRUE});

         try {
            var2 = it.c.keys();

            while(var2.hasMoreElements()) {
               String var7 = (String)var2.nextElement();

               try {
                  File var8 = (File)nua.d.get(var7);
                  Class var9 = (Class)it.c.get(var7);
                  Vector var10 = (Vector)var5.get(var9.getClassLoader());

                  for(int var11 = 0; ~var11 > ~var10.size(); ++var11) {
                     try {
                        Object var12 = var10.elementAt(var11);
                        Field var13 = var12.getClass().getDeclaredField("name");
                        var6.invoke(var13, new Object[]{Boolean.TRUE});

                        try {
                           String var14 = (String)var13.get(var12);
                           if(var14 != null && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
                              Field var15 = var12.getClass().getDeclaredField("handle");
                              Method var16 = var12.getClass().getDeclaredMethod("finalize", new Class[0]);
                              var6.invoke(var15, new Object[]{Boolean.TRUE});
                              var6.invoke(var16, new Object[]{Boolean.TRUE});

                              try {
                                 var16.invoke(var12, new Object[0]);
                                 var15.set(var12, new Integer(0));
                                 var1.remove(var7);
                              } catch (Throwable var18) {
                                 ;
                              }

                              var6.invoke(var16, new Object[]{Boolean.FALSE});
                              var6.invoke(var15, new Object[]{Boolean.FALSE});
                           }
                        } catch (Throwable var19) {
                           ;
                        }

                        var6.invoke(var13, new Object[]{Boolean.FALSE});
                     } catch (Throwable var20) {
                        ;
                     }
                  }
               } catch (Throwable var21) {
                  ;
               }
            }
         } catch (Throwable var22) {
            ;
         }

         var6.invoke(var5, new Object[]{Boolean.FALSE});
      } catch (Throwable var23) {
         ;
      }

      it.c = var1;
      if(var0 > -41) {
         b((Object[])null, false);
      }

      return it.c.isEmpty();
   }

   final boolean a() {
      ++q;
      return fp.a(true, this.m);
   }

   final int e() {
      ++y;
      return br.a(3112, this.m);
   }

   final void c() {
      ++p;
      kh.a(this.m, 23);
   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      ++A;
      int var3 = 33 / ((34 - var0) / 32);
      ct.a(var1, (Object[])((Object[])((Object[])((Object[])var2[8]))[28]), (Object[])((Object[])((Object[])((Object[])var2[8]))[26]), (Object[])((Object[])var2[8]), -92);
   }

   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3) {
      aa.a(15022, var0, var3);
      if(var1 != 8469) {
         return (Object[])null;
      } else {
         ++w;
         return var3;
      }
   }

   static final Object[] b(Object[] var0, boolean var1) {
      if(!var1) {
         return (Object[])null;
      } else {
         ++v;
         jfa.a(0.55F, 5, 8, 8, 2, var0, 0.1F, (byte)-52, 3.0F, 8);
         return var0;
      }
   }

   final void b(int var1, int var2) {
      ++s;
      Object[] var3 = this.m;
      if(var3 != null && 8 == var3.length) {
         dka.a((byte)-125, var3, var1, var2);
      } else if(var3 != null && 6 == var3.length) {
         pm.a(var2, var1, 3, var3);
      } else {
         kr.a(var1, var2, var3, 7235);
      }

   }

   final int f() {
      ++z;
      return nua.a(5828, this.m);
   }

   protected final void finalize() throws Throwable {
      ++x;
      client.b((byte)-35, this.m);
   }

   static final boolean a(Object[] var0, byte var1) {
      if(var1 >= -65) {
         return true;
      } else {
         ++f_l;
         return var0[16] != null?((ka)var0[16]).XA():false;
      }
   }

   ww(Object[] var1) {
      this.m = var1;
   }

}
