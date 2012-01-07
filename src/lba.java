import jaggl.OpenGL;

final class lba {

   static int g;
   static int c;
   static Object[] h = bj.a(-108, new Object[12]);
   static int f_i;
   static int b;
   static int a;
   static int e;
   static Object[] f = bj.a(-63, new Object[12]);
   static Object[][] d = new Object[][]{f, h};


   static final void b(Object[] var0, int var1) {
      ++b;
      if(var0 != null && (var0.length == 5 && 7 == ((int[])((int[])var0[1])).length || var0.length == 6 || -9 == ~var0.length)) {
         ko.a(5, var0);
      } else {
         if(var1 != 4168) {
            f = (Object[])null;
         }

         if(var0 != null && (4 == var0.length || 5 == var0.length && ((int[])((int[])var0[1])).length == 13 || 7 == var0.length)) {
            ((int[])((int[])var0[1]))[5] = ((int[])((int[])var0[1]))[9];
            ((int[])((int[])var0[1]))[10] >>= 4;
            if(((int[])((int[])var0[1]))[10] >= 0) {
               if(((int[])((int[])var0[1]))[10] > 255) {
                  ((int[])((int[])var0[1]))[10] = 255;
               }
            } else {
               ((int[])((int[])var0[1]))[10] = 0;
            }

            byte var10000 = (byte)((int[])((int[])var0[1]))[10];
            int[] var10002 = (int[])((int[])var0[1]);
            int var10005 = ((int[])((int[])var0[1]))[6];
            var10002[6] = ((int[])((int[])var0[1]))[6] + 1;
            nga.a(var10000, var0, var10005, (byte)-68);
            ((int[])((int[])var0[1]))[10] = 0;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(boolean var0, int var1, Object[] var2, boolean var3) {
      ++g;
      if(var1 == 4) {
         int var11 = ((int[])((int[])var2[1]))[1];
         int var12 = (int)((lm)(null != var2?var2[0]:null)).e;
         ((lm)(var2 != null?var2[0]:null)).a((byte)41);
         if(var3) {
            cv.a(var11, (byte)67);
         }

         for(lm var13 = qt.a(var1 - 4, wra.g); var13 != null; var13 = nda.a(var1 - 3, wra.g)) {
            if((long)var11 == (var13.e >> 48 & 65535L)) {
               var13.a((byte)17);
            }
         }

         Object[] var17 = hg.a(var12, (byte)-114);
         if(var17 != null) {
            vr.a(var17, (int)24);
         }

         rra.a(1);
         if(!var0 && bqa.j != -1) {
            su.a(1, bqa.j, false);
         }

         Object[] var14 = InputStreamWorker.a(new Object[3], (byte)-117, lfa.c);

         oh var6;
         oh var7;
         for(Object[] var15 = (var6 = (oh)wla.a((byte)98, var14)) == null?null:var6.p; null != var15; var15 = null == (var7 = (oh)em.a(0, var14))?null:var7.p) {
            if(!((lm)(null != var15?var15[0]:null)).a(false)) {
               oh var9;
               var15 = null != (var9 = (oh)wla.a((byte)126, var14))?var9.p:null;
               if(null == var15) {
                  break;
               }
            }

            if(((int[])((int[])var15[1]))[0] == 3) {
               int var16 = (int)((lm)(null == var15?null:var15[0])).e;
               if(~var11 == ~(var16 >>> 16)) {
                  a(var0, var1 ^ 0, var15, true);
               }
            }
         }

      }
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2) {
      ++a;
      var0[0] = var2;
      return var1 < 36?(Object[])null:var0;
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != -25699) {
         d = (Object[][])((Object[][])h[5]);
      }

      ++e;
      return (int)((float[])((float[])((Object[])((Object[])var0[2]))[1]))[2];
   }

   static final void a(Object[] var0, float var1, float var2, Object[] var3, float var4, boolean var5) {
      ++f_i;
      int var6 = tea.a(false, var3);
      if(-1 != var6) {
         if(((float[])((float[])var0[14]))[var6] != var4 || ((float[])((float[])var0[8]))[var6] != var2 || ((float[])((float[])var0[11]))[var6] != var1) {
            ((float[])((float[])var0[14]))[var6] = var4;
            ((float[])((float[])var0[8]))[var6] = var2;
            ((float[])((float[])var0[11]))[var6] = var1;
            if(eva.b(-91, var3) != pc.a) {
               throw new bba(var3, "");
            }

            OpenGL.glUniform3f(var6, var4, var2, var1);
         }

         if(!var5) {
            var0[4] = (Object)null;
         }

      }
   }

   static final boolean a(int var0, Object[] var1) {
      int var2 = 70 % ((80 - var0) / 39);
      ++c;
      ui.a((Object[])((Object[])var1[2]), ((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[1], (int[])(null == var1[4]?null:((Object[])((Object[])var1[4]))[2]), (float[])(null == var1[0]?null:((Object[])((Object[])var1[0]))[0]));
      return true;
   }

}
