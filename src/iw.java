import jaggl.OpenGL;

final class iw {

   static Object[] e = ho.a(0, 15, new Object[1], true);
   static int f;
   static int a;
   static int c;
   static int b;
   static int d;


   static final Object[][] a(byte var0) {
      if(var0 > -109) {
         e = (Object[])((Object[])e[3]);
      }

      ++f;
      return new Object[][]{vg.c, paa.a, sea.f_l};
   }

   static final void a(int var0, int var1, Object[] var2) {
      if(var1 > 120) {
         ++c;
         if(var0 != 1) {
            throw new IllegalArgumentException("");
         }
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++b;
      if(!var1) {
         e = (Object[])null;
      }

      if(((boolean[])((boolean[])var0[8]))[1]) {
         float var2 = ((float[])((float[])((Object[])((Object[])var0[0]))[25]))[5];
         float var3 = ((float[])((float[])((Object[])((Object[])var0[0]))[25]))[1];
         float var4 = var2 - 0.125F * (var2 - var3);
         float var5 = var2 - (var2 - var3) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var5, var4, 256.0F / (float)((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[0]))[3]))[0]))[5], (float)((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[0]))[3]))[0]))[0] / 255.0F);
         nha.a((Object[])((Object[])var0[0]), 18806, 1);
         fd.a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[0]))[3]))[0]))[1], (Object[])((Object[])var0[0]), -114);
         nha.a((Object[])((Object[])var0[0]), 18806, 0);
      }

   }

   static final void a(boolean var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[3];
      }

      if(!var0) {
         a(62, -42, -68, 15, ((byte[])((byte[])var1[7]))[10], (Object[])null, 68, 120);
      }

      if(null == var1[5]) {
         var1[5] = new float[2];
      }

      ++d;
   }

   static final void a(int var0, int var1, int var2, int var3, byte var4, Object[] var5, int var6, int var7) {
      ++a;
      long var19 = -1L;
      Object[] var8;
      int var21 = (var6 << ((aa)(null != (var8 = (Object[])((Object[])var5[3]))?var8[6]:null)).a) + var2;
      Object[] var9;
      int var22 = (var1 << ((aa)(null == (var9 = (Object[])((Object[])var5[3]))?null:var9[6])).a) + var7;
      Object[] var10;
      int var23 = ((aa)(null == (var10 = (Object[])((Object[])var5[3]))?null:var10[6])).a(1, var21, var22);
      if((var2 & 127) == 0 || (var7 & 127) == 0) {
         var19 = 65535L & (long)var21 | (65535L & (long)var22) << 16;
         lm var24 = pm.a(var19, (Object[])((Object[])var5[14]), false);
         if(null != var24) {
            dga var11;
            vt.a(((short[])((short[])(null == (var11 = (dga)var24)?null:var11.f_l)[0]))[0], 46, var5);
            return;
         }
      }

      if(var5 != null && var5.length == 25 && var5[7].equals(Integer.valueOf(1)) && var5[7].equals(Integer.valueOf(1))) {
         vt.a((short)30, var4 ^ 17, new Object[1][]);
      }

      int[] var10000 = (int[])((int[])var5[1]);
      int var10003 = ((int[])((int[])var5[1]))[1];
      var10000[1] = ((int[])((int[])var5[1]))[1] + 1;
      short var41 = (short)var10003;
      if(~var19 != 0L) {
         Object[] var12;
         di.a((Object[])((Object[])var5[14]), true, (lm)(null != (var12 = jha.a(124, var41, new Object[2]))?var12[1]:null), var19);
      }

      float var25;
      float var27;
      float var26;
      float var29;
      float var28;
      float var31;
      float var30;
      float var34;
      float var35;
      float var32;
      float var33;
      if(var2 == 0 && var7 == 0) {
         var26 = ((float[][])((float[][])var5[8]))[var0][var3];
         var27 = ((float[][])((float[][])var5[5]))[var0][var3];
         var25 = ((float[][])((float[][])var5[9]))[var0][var3];
      } else {
         Object[] var13;
         if(((aa)(null != (var13 = (Object[])((Object[])var5[3]))?var13[6]:null)).g == var2 && var7 == 0) {
            var25 = ((float[][])((float[][])var5[9]))[1 + var0][var3];
            var26 = ((float[][])((float[][])var5[8]))[1 + var0][var3];
            var27 = ((float[][])((float[][])var5[5]))[1 + var0][var3];
         } else {
            Object[] var14;
            Object[] var15;
            if(var2 == ((aa)(null != (var14 = (Object[])((Object[])var5[3]))?var14[6]:null)).g && ((aa)((var15 = (Object[])((Object[])var5[3])) == null?null:var15[6])).g == var7) {
               var26 = ((float[][])((float[][])var5[8]))[var0 + 1][var3 + 1];
               var27 = ((float[][])((float[][])var5[5]))[1 + var0][var3 + 1];
               var25 = ((float[][])((float[][])var5[9]))[var0 + 1][1 + var3];
            } else {
               Object[] var16;
               if(0 == var2 && ((aa)((var16 = (Object[])((Object[])var5[3])) != null?var16[6]:null)).g == var7) {
                  var26 = ((float[][])((float[][])var5[8]))[var0][1 + var3];
                  var25 = ((float[][])((float[][])var5[9]))[var0][1 + var3];
                  var27 = ((float[][])((float[][])var5[5]))[var0][var3 + 1];
               } else {
                  Object[] var17;
                  var28 = (float)var2 / (float)((aa)(null == (var17 = (Object[])((Object[])var5[3]))?null:var17[6])).g;
                  Object[] var18;
                  var29 = (float)var7 / (float)((aa)((var18 = (Object[])((Object[])var5[3])) != null?var18[6]:null)).g;
                  var30 = ((float[][])((float[][])var5[9]))[var0][var3];
                  var31 = ((float[][])((float[][])var5[8]))[var0][var3];
                  var32 = ((float[][])((float[][])var5[5]))[var0][var3];
                  var33 = ((float[][])((float[][])var5[9]))[1 + var0][var3];
                  var34 = ((float[][])((float[][])var5[8]))[1 + var0][var3];
                  var35 = ((float[][])((float[][])var5[5]))[1 + var0][var3];
                  if(var5 != null && var5.length == 12 && var5[6].equals(Boolean.valueOf(false))) {
                     vu.a((byte)-2, (Object[])null, (Object[])null, (int[])null, (Object[])null, (Object[])null);
                  }

                  var33 += var28 * (((float[][])((float[][])var5[9]))[1 + var0][var3 + 1] - var33);
                  var35 += (-var35 + ((float[][])((float[][])var5[5]))[1 + var0][1 + var3]) * var28;
                  var32 += (-var32 + ((float[][])((float[][])var5[5]))[var0][var3 + 1]) * var28;
                  var30 += (((float[][])((float[][])var5[9]))[var0][1 + var3] - var30) * var28;
                  var31 += var28 * (-var31 + ((float[][])((float[][])var5[8]))[var0][var3 + 1]);
                  var34 += var28 * (-var34 + ((float[][])((float[][])var5[8]))[1 + var0][var3 + 1]);
                  var27 = (-var32 + var35) * var29 + var32;
                  var26 = (var34 - var31) * var29 + var31;
                  var25 = var29 * (-var30 + var33) + var30;
               }
            }
         }
      }

      var28 = (float)(lba.a((Object[])((Object[])var5[4]), -25699) + -var21);
      var29 = (float)(sla.a((Object[])((Object[])var5[4]), false) + -var23);
      var30 = (float)(-var22 + fn.a((Object[])((Object[])var5[4]), 87));
      if(var4 == 15) {
         var31 = (float)Math.sqrt((double)(var28 * var28 + var29 * var29 + var30 * var30));
         var32 = 1.0F / var31;
         var29 *= var32;
         var30 *= var32;
         var28 *= var32;
         var33 = var31 / (float)mc.a(false, (Object[])((Object[])var5[4]));
         var34 = -(var33 * var33) + 1.0F;
         if(var34 < 0.0F) {
            var34 = 0.0F;
         }

         var35 = var27 * var30 + var28 * var25 + var29 * var26;
         if(0.0F > var35) {
            var35 = 0.0F;
         }

         float var36 = var35 * var34 * 2.0F;
         if(var36 > 1.0F) {
            var36 = 1.0F;
         }

         int var37 = gaa.a((Object[])((Object[])var5[4]), (byte)-69);
         int var38 = (int)(var36 * (float)(255 & var37 >> 16));
         if(255 < var38) {
            var38 = 255;
         }

         int var39 = (int)((float)(var37 >> 8 & 255) * var36);
         if(var39 > 255) {
            var39 = 255;
         }

         int var40 = (int)(var36 * (float)(var37 & 255));
         if(((boolean[])((boolean[])((Object[])((Object[])var5[13]))[17]))[11]) {
            tua.putFloat((Object[])((Object[])var5[0]), (byte)-126, (float)var21);
            tua.putFloat((Object[])((Object[])var5[0]), (byte)-128, (float)var23);
            tua.putFloat((Object[])((Object[])var5[0]), (byte)-126, (float)var22);
         } else {
            uq.putFloatLE(var4 - 14, (float)var21, (Object[])((Object[])var5[0]));
            uq.putFloatLE(1, (float)var23, (Object[])((Object[])var5[0]));
            uq.putFloatLE(1, (float)var22, (Object[])((Object[])var5[0]));
         }

         if(var40 > 255) {
            var40 = 255;
         }

         ek.putByte((Object[])((Object[])var5[0]), var38);
         ek.putByte((Object[])((Object[])var5[0]), var39);
         ek.putByte((Object[])((Object[])var5[0]), var40);
         ek.putByte((Object[])((Object[])var5[0]), 255);
         vt.a(var41, -108, var5);
      }
   }

}
