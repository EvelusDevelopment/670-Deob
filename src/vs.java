import jaggl.OpenGL;
import java.awt.event.FocusEvent;

final class vs {

   static int a;
   static int f_i;
   static int d;
   static int b;
   static int h;
   static int f;
   static int e;
   static int c;
   static int g;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, ta var6) {
      ++f;
      if((om.g == null || ws.A == null || rc.g == null) && hp.a(-126, lta.h, dka.f) && hp.a(-124, lta.h, fka.d) && hp.a(-126, lta.h, ck.h)) {
         aea var7 = aea.b(lta.h, fka.d, 0);
         ws.A = var6.a(var7, true);
         var7.c();
         gba.r = var6.a(var7, true);
         om.g = var6.a(aea.b(lta.h, dka.f, 0), true);
         aea var8 = aea.b(lta.h, ck.h, 0);
         rc.g = var6.a(var8, true);
         var8.c();
         cna.f = var6.a(var8, true);
      }

      if(var5 != 0) {
         a((byte)-92, new Object[4]);
      }

      if(om.g != null && ws.A != null && rc.g != null) {
         int var10 = (-(2 * rc.g.e()) + var0) / om.g.e();

         int var11;
         for(var11 = 0; var10 > var11; ++var11) {
            om.g.a(var4 + rc.g.e() + om.g.e() * var11, -om.g.g() + var2 + var3);
         }

         var11 = (var3 + -var1 + -rc.g.g()) / ws.A.g();

         for(int var9 = 0; var11 > var9; ++var9) {
            ws.A.a(var4, var2 + var1 + ws.A.g() * var9);
            gba.r.a(var0 + var4 - gba.r.e(), var1 + var2 + ws.A.g() * var9);
         }

         rc.g.a(var4, -rc.g.g() + var3 + var2);
         cna.f.a(var4 + (var0 - rc.g.e()), var3 + var2 + -rc.g.g());
      }

   }

   static final void a(boolean var0, FocusEvent var1, Object[] var2) {
      ++h;
      if(!var0) {
         ((boolean[])((boolean[])var2[1]))[0] = ((boolean[])((boolean[])var2[40]))[13];
      }

   }

   static final int a(byte var0, Object[] var1) {
      ++f_i;
      int var2 = -93 % ((var0 + 82) / 35);
      return 0;
   }

   static final char a(int var0, char var1) {
      ++g;
      return var0 != 0?'\uffc3':(32 != var1 && var1 != 160 && var1 != 95 && 45 != var1?(91 != var1 && var1 != 93 && 35 != var1?(224 != var1 && var1 != 225 && var1 != 226 && 228 != var1 && 227 != var1 && var1 != 192 && 193 != var1 && 194 != var1 && 196 != var1 && var1 != 195?(231 != var1 && 199 != var1?(237 != var1 && 238 != var1 && var1 != 239 && 205 != var1 && 206 != var1 && var1 != 207?(var1 != 242 && var1 != 243 && 244 != var1 && var1 != 246 && 245 != var1 && var1 != 210 && 211 != var1 && 212 != var1 && 214 != var1 && 213 != var1?(var1 != 232 && var1 != 233 && 234 != var1 && 235 != var1 && 200 != var1 && var1 != 201 && var1 != 202 && 203 != var1?(var1 != 249 && 250 != var1 && var1 != 251 && 252 != var1 && 217 != var1 && 218 != var1 && var1 != 219 && var1 != 220?(var1 != 223?(241 != var1 && 209 != var1?(var1 != 255 && 376 != var1?Character.toLowerCase(var1):'y'):'n'):'b'):'u'):'e'):'o'):'i'):'c'):'a'):var1):'_');
   }

   static final void a(int var0, Object[] var1, int var2, int var3) {
      ((int[])((int[])var1[5]))[var3] = var2;
      if(var0 == 99) {
         ++c;
         ni.a(true, var1);
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      ++e;
      if(var2 > -69) {
         return (Object[])((Object[])var0[0]);
      } else {
         int var3 = -1;
         if(-1 == ((int[])((int[])var1[1]))[40]) {
            if(((int[])((int[])var1[1]))[20] != -1) {
               var3 = cj.a(-125, ((int[])((int[])var1[1]))[20], var0);
            }
         } else {
            var3 = rg.a(1, ((int[])((int[])var1[1]))[40], var0);
         }

         if(var3 >= 0 && -1 + ((int[])((int[])var1[11])).length > var3 && ~((int[])((int[])var1[11]))[var3] != 0) {
            return mca.a(true, ((int[])((int[])var1[11]))[var3], (Object[])((Object[])var1[7]));
         } else {
            int var4 = ((int[])((int[])var1[11]))[-1 + ((int[])((int[])var1[11])).length];
            return -1 == var4?null:mca.a(true, var4, (Object[])((Object[])var1[7]));
         }
      }
   }

   static final void a(int var0, int var1, Object[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8) {
      ++d;
      ah.a((Object[])((Object[])var2[var4]), var2, (byte)93);
      OpenGL.glPixelStorei(3314, var0);
      OpenGL.glTexSubImage2Di(((int[])((int[])var2[1]))[2], 0, var5, var8, var6, var1, '\u80e1', ((int[])((int[])((Object[])((Object[])var2[5]))[1]))[40], var3, var7);
      OpenGL.glPixelStorei(3314, 0);
   }

   static final int a(String var0, byte var1) {
      if(var1 != 14) {
         return 23;
      } else {
         ++b;
         return var0.length() + 1;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      ++a;
      long var8 = (long)((!var5?0:Integer.MIN_VALUE) | var0);
      if(var1 <= 103) {
         a(-42, -40, -57, -69, 126, true);
      }

      lq var6;
      Object[] var10 = null != (var6 = (lq)pm.a(var8, wp.c, false))?var6.r:null;
      if(null == var10) {
         Object[] var12 = new Object[3];
         ik.a((byte)107, var12);
         lq var14 = new lq(var12);
         var12[1] = var14;
         var10 = var12;
         di.a(wp.c, true, (lm)(null != var12?var12[1]:null), var8);
      }

      if(((int[])((int[])var10[2])).length <= var2) {
         int[] var11 = new int[var2 + 1];
         int[] var15 = new int[1 + var2];

         int var13;
         for(var13 = 0; ((int[])((int[])var10[2])).length > var13; ++var13) {
            var11[var13] = ((int[])((int[])var10[2]))[var13];
            var15[var13] = ((int[])((int[])var10[0]))[var13];
         }

         for(var13 = ((int[])((int[])var10[2])).length; var2 > var13; ++var13) {
            var11[var13] = -1;
            var15[var13] = 0;
         }

         var10[2] = var11;
         if(var10 != null && 2 == var10.length && var10[0].equals(Integer.valueOf(0))) {
            ((boolean[])((boolean[])be.a[0]))[3] = true;
         }

         var10[0] = var15;
      }

      ((int[])((int[])var10[2]))[var2] = var4;
      ((int[])((int[])var10[0]))[var2] = var3;
   }

}
