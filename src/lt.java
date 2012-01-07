import jaggl.OpenGL;
import java.awt.event.ActionEvent;

final class lt {

   static int c;
   static int e;
   static int f;
   static int d;
   static int h = 0;
   static int b;
   static int g;
   static Object a;


   static final void a(int var0, Object var1) {
      ++e;
      if(fo.d != null) {
         int var2 = 0;
         if(var0 != 1392) {
            h = 30;
         }

         while(var2 < 50 && null != fo.d.peekEvent()) {
            qs.a(1L, 50);
            ++var2;
         }

         try {
            if(var1 != null) {
               fo.d.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }
         } catch (Exception var4) {
            ;
         }

      }
   }

   static final void b(Object[] var0, int var1) {
      var0[4] = ura.a(-75, new Object[2]);
      ++d;
      var0[1] = ura.a(-96, new Object[2]);
      var0[2] = new boolean[112];
      if(var1 > -37) {
         a = (Object)null;
      }

   }

   static final Object[] a(Object[] var0, int var1) {
      ++b;
      oga var2;
      Object[] var5 = null == (var2 = (oga)pm.a((long)(((int[])((int[])((Object[])((Object[])var0[0]))[1]))[0] << 14 | ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[2] << 28 | ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[1]), vg.e, false))?null:var2.k;
      if(null != var5) {
         gn var3;
         gn var4;
         for(Object[] var6 = null != (var3 = (gn)dda.a((Object[])((Object[])var5[0]), 2))?var3.j:null; null != var6; var6 = null != (var4 = (gn)client.a((Object[])((Object[])var5[0]), -28280))?var4.j:null) {
            if(~((int[])((int[])var6[1]))[1] == ~((int[])((int[])var0[1]))[0]) {
               return tj.a(((int[])((int[])((Object[])((Object[])var0[0]))[1]))[2], -rs.f + ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[1], -qm.d + ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[0]);
            }
         }

         if(var1 <= 92) {
            ((boolean[])((boolean[])var0[1]))[4] = true;
         }

         if(null != var5 && var5.length == 6 && var5[3].equals(Integer.valueOf(2))) {
            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   static final int a(byte var0, Object[] var1) {
      ++f;
      int var2 = 14 % ((46 - var0) / 51);
      return var1[4] != null?((int[])((int[])((Object[])((Object[])var1[4]))[1]))[3]:-1;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Object[] var8) {
      ++c;
      OpenGL.glLineWidth((float)var7);
      lha.a(var0, var2, 107, var6, var1, var3, var5, var8);
      OpenGL.glLineWidth(1.0F);
      if(var4 != 3) {
         a(((int[])((int[])var8[5]))[1], ((int[])((int[])var8[7]))[0], -72, -100);
      }

   }

   static final boolean a(int var0, int var1, int var2, int var3) {
      if(var3 != 10412) {
         b((Object[])null, 93);
      }

      ++g;
      if(cq.h && bqa.f_i) {
         if(102 > tia.f_i) {
            return false;
         } else {
            int var4 = so.f[var0][var1][var2];
            if(var4 != -nda.c) {
               if(var4 != nda.c) {
                  if(wd.a == jp.o) {
                     return false;
                  } else {
                     int var5 = var1 << qqa.e;
                     int var6 = var2 << qqa.e;
                     if(fw.a(iia.n + (var6 - 1), 1 + var5, 1 + var6, -1 + var6 + iia.n, jp.o[var0].b(-67, 1 + var2, var1), jp.o[var0].b(-71, var2 + 1, var1 + 1), var5 + 1, jp.o[var0].b(-104, var2, var1), -13544, var5 + iia.n - 1) && fw.a(-1 + iia.n + var6, -1 + var5 + iia.n, var6 + 1, var6 + 1, jp.o[var0].b(-48, var2 + 1, 1 + var1), jp.o[var0].b(-65, var2, 1 + var1), 1 + var5, jp.o[var0].b(-103, var2, var1), -13544, var5 + (iia.n - 1))) {
                        so.f[var0][var1][var2] = nda.c;
                        return true;
                     } else {
                        so.f[var0][var1][var2] = -nda.c;
                        return false;
                     }
                  }
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

}
