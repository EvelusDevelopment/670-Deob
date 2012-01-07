import jaggl.OpenGL;

final class nt {

   static int f;
   static int d;
   static Object[] h = sd.a(new Object[1], 10, (byte)119);
   static int g;
   static int a;
   static int c;
   static int b;
   static Object[] j = ve.a(new Object[1], (byte)3, 1);
   static boolean[] e;
   static Object[] f_i;


   static final void a(Object[] var0, int var1) {
      if(null == var0[var1]) {
         var0[1] = new int[2];
      }

      ++c;
      ((int[])((int[])var0[1]))[1] = 2;
   }

   static final Object[] c(Object[] var0, int var1) {
      ++f;
      int var2 = 127 % ((var1 + 6) / 55);
      return ((Object[][])((Object[][])var0[59]))[((int[])((int[])var0[1]))[7]];
   }

   static final void a(boolean var0, int var1, int var2, int var3, boolean var4, int var5, int var6, int var7, int var8, Object[] var9) {
      ++d;
      if(var4 | var0) {
         int var11 = ((int[])((int[])var9[5]))[4];
         Object[] var10;
         int var12 = ((ta)((var10 = (Object[])((Object[])var9[4])) == null?null:var10[38])).e(30626).d();
         int var13 = 0;
         if(var0) {
            var13 |= 256;
         }

         if(var4) {
            var13 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', ((int[])((int[])var9[5]))[2]);
         OpenGL.glBlitFramebufferEXT(var8, -var6 + -var3 + var11, var1 + var8, -var3 + var11, var2, -var6 + -var7 + var12, var2 + var1, -var7 + var12, var13, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

      if(var5 != -18714) {
         c((Object[])((Object[])f_i[0]), -74);
      }

   }

   static final Object[] b(Object[] var0, int var1) {
      ++b;
      int var3 = -62 % ((59 - var1) / 40);
      if(var0[0] == null) {
         ska.a[1] = ((int[])((int[])var0[1]))[4];
         ska.a[3] = ((int[])((int[])var0[1]))[2];
         Object[] var2;
         qa var4 = ((ta)(null == (var2 = (Object[])((Object[])var0[2]))?null:var2[55])).k;
         ska.a[4] = ((int[])((int[])var0[1]))[5];
         ska.a[2] = ((int[])((int[])var0[1]))[3];
         ska.a[5] = ((int[])((int[])var0[1]))[1];
         ska.a[0] = ((int[])((int[])var0[1]))[0];
         boolean var5 = false;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < 6; ++var7) {
            if(!var4.a(-20460, ska.a[var7])) {
               return null;
            }

            Object[] var8 = var4.a(ska.a[var7], (byte)111);
            int var9 = !((boolean[])((boolean[])var8[3]))[4]?128:64;
            if(-1 > ~((byte[])((byte[])var8[0]))[2]) {
               var5 = true;
            }

            if(var9 > var6) {
               var6 = var9;
            }
         }

         for(var7 = 0; var7 < 6; ++var7) {
            lf.b[var7] = var4.a(var6, 1.0F, false, -6300, var6, ska.a[var7]);
         }

         Object[] var16 = new Object[6];
         if(var16 != null && -21 == ~var16.length) {
            ipa.a((Object[])null, (byte)-50);
         }

         Object[] var10 = (Object[])((Object[])var0[2]);
         Object[] var11 = hf.d;
         Object[] var12 = vk.f;
         boolean var13 = var5;
         int[][] var14 = lf.b;
         wla.b(var16, -85);
         np.a(1, var11, var10, '\u8513', var16, var12, var13, 6 * var6 * var6);
         ((int[])((int[])var16[1]))[3] = var6;
         moa.a((byte)117, var16, (Object[])((Object[])var16[4]));
         int var15;
         if(!var13) {
            if(null != var10 && var10.length == 4) {
               b((Object[])null, -30);
            }

            for(var15 = 0; var15 < 6; ++var15) {
               OpenGL.glTexImage2Di(var15 + '\u8515', 0, bu.a(80, (Object[])((Object[])var16[5]), (Object[])((Object[])var16[2])), var6, var6, 0, '\u80e1', ((int[])((int[])((Object[])((Object[])var16[4]))[1]))[37], var14[var15], 0);
            }
         } else {
            for(var15 = 0; 6 > var15; ++var15) {
               ega.a(-768979816, '\u80e1', var6, bu.a(49, (Object[])((Object[])var16[5]), (Object[])((Object[])var16[2])), ((int[])((int[])((Object[])((Object[])var16[4]))[1]))[37], var15 + '\u8515', var14[var15], var6);
            }

            if(null != var10 && (-2 == ~var10.length || var10.length == 24 || var10.length == 9 && var10[0].equals(Integer.valueOf(0)) && var10[0].equals(Integer.valueOf(1)))) {
               ipa.a((Object[])null, (byte)-50);
            }
         }

         gg.a((byte)-122, var16, true);
         var0[0] = var16;
      }

      return (Object[])((Object[])var0[0]);
   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3, int var4, int var5, int var6, int var7, int var8) {
      ++a;
      if(var5 != -21369) {
         c((Object[])null, ((int[])((int[])var3[6]))[8]);
      }

      if(var3[0] == null) {
         var3[0] = new int[7];
      }

      ((int[])((int[])var3[0]))[5] = var6;
      ((int[])((int[])var3[0]))[4] = var7;
      ((int[])((int[])var3[0]))[0] = var1;
      ((int[])((int[])var3[0]))[2] = var8;
      ((int[])((int[])var3[0]))[1] = var2;
      ((int[])((int[])var3[0]))[6] = var4;
      ((int[])((int[])var3[0]))[3] = var0;
      return var3;
   }

}
