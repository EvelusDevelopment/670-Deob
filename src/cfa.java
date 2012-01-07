import java.nio.ByteBuffer;

final class cfa {

   static int b;
   static int a;
   static int d;
   static int e;
   static int c;


   static final void a(int var0, Object[] var1) {
      ++a;
      if(var1[5] == null) {
         var1[5] = new boolean[1];
      }

      int var2 = 103 / ((var0 - 61) / 58);
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      ++c;
      if(var1 != 9) {
         a(((int[])((int[])var2[2]))[0], ((int[])((int[])var2[0]))[2], (Object[])null);
      }

      if(((int[])((int[])((Object[][])((Object[][])var2[2]))[0][1]))[3] >>> 16 == var0 >>> 16) {
         return ((Object[][])((Object[][])var2[2]))[var0 & '\uffff'];
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void a(String var0, boolean var1) {
      ++b;
      if(var0 != null) {
         String var2 = dm.a((int)-32, var0);
         if(null != var2) {
            if(var1) {
               for(int var3 = 0; var3 < kl.k; ++var3) {
                  String var4 = eb.a[var3];
                  String var5 = dm.a((int)-117, var4);
                  if(mp.a(8364, var2, var0, var5, var4)) {
                     --kl.k;

                     for(int var6 = var3; var6 < kl.k; ++var6) {
                        eb.a[var6] = eb.a[var6 + 1];
                        toa.j[var6] = toa.j[1 + var6];
                        le.b[var6] = le.b[1 + var6];
                        jpa.c[var6] = jpa.c[1 + var6];
                        eha.q[var6] = eha.q[var6 + 1];
                     }

                     ++dp.v;
                     lta.c = qr.a;
                     Object[] var8 = hua.a(true);
                     Object[] var7 = ona.a((byte)122, (Object[])((Object[])var8[7]), od.a);
                     ek.putByte((Object[])((Object[])var7[0]), vs.a(var0, (byte)14));
                     bw.a(var0, (byte)0, (Object[])((Object[])var7[0]));
                     lj.a(var7, 6, var8);
                     break;
                  }
               }

            }
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, boolean var3) {
      ++e;
      int var4 = 0;
      if(var3) {
         var0[3] = (Object)null;
      }

      Object[] var5 = (Object[])((Object[])var0[28]);
      float var6 = ((float[])((float[])var5[0]))[0];
      float var7 = ((float[])((float[])var5[0]))[4];
      float var8 = ((float[])((float[])var5[0]))[8];
      float var9 = ((float[])((float[])var5[0]))[1];
      float var10 = ((float[])((float[])var5[0]))[5];
      float var11 = ((float[])((float[])var5[0]))[9];
      float var12 = var6 + var9;
      float var13 = var7 + var10;
      float var14 = var8 + var11;
      float var15 = -var9 + var6;
      float var16 = -var10 + var7;
      float var17 = -var11 + var8;
      float var18 = var9 - var6;
      float var19 = -var7 + var10;
      float var20 = var11 - var8;
      ByteBuffer var21 = (ByteBuffer)var0[57];
      var21.clear();

      for(int var22 = var1 - 1; var22 >= 0; --var22) {
         int var23 = ((int[])((int[])var2[8]))[var22] <= 64?((int[])((int[])var2[8]))[var22]:64;
         if(var23 > 0) {
            int var24;
            byte var29;
            byte var28;
            byte var30;
            float var32;
            float var33;
            for(var24 = var23 - 1; var24 >= 0; --var24) {
               vsa var25 = ((vsa[][])((vsa[][])var2[6]))[var22][var24];
               int var26 = var25.A;
               byte var27 = (byte)(var26 >> 16);
               var28 = (byte)(var26 >> 8);
               var29 = (byte)var26;
               var30 = (byte)(var26 >>> 24);
               float var31 = (float)(var25.B >> 12);
               var32 = (float)(var25.z >> 12);
               var33 = (float)(var25.v >> 12);
               int var34 = var25.C >> 12;
               var21.putFloat(var12 * (float)(-var34) + var31);
               var21.putFloat(var13 * (float)(-var34) + var32);
               var21.putFloat((float)(-var34) * var14 + var33);
               if(null != var0 && -11 == ~var0.length) {
                  gu.b(-2, (Object[])null);
               }

               if(-1 == ~((int[])((int[])var0[1]))[9]) {
                  var21.put(var29);
                  var21.put(var28);
                  var21.put(var27);
                  var21.put(var30);
               } else {
                  var21.put(var27);
                  var21.put(var28);
                  var21.put(var29);
                  var21.put(var30);
               }

               var21.putFloat(0.0F);
               var21.putFloat(0.0F);
               var21.putFloat(var31 + var18 * (float)var34);
               var21.putFloat(var32 + var19 * (float)var34);
               var21.putFloat((float)var34 * var20 + var33);
               if(-1 != ~((int[])((int[])var0[1]))[9]) {
                  var21.put(var27);
                  var21.put(var28);
                  var21.put(var29);
                  var21.put(var30);
               } else {
                  var21.put(var29);
                  var21.put(var28);
                  var21.put(var27);
                  var21.put(var30);
               }

               var21.putFloat(0.0F);
               var21.putFloat(1.0F);
               var21.putFloat(var12 * (float)var34 + var31);
               var21.putFloat(var13 * (float)var34 + var32);
               var21.putFloat(var33 + (float)var34 * var14);
               if(((int[])((int[])var0[1]))[9] == 0) {
                  var21.put(var29);
                  var21.put(var28);
                  var21.put(var27);
                  var21.put(var30);
               } else {
                  var21.put(var27);
                  var21.put(var28);
                  var21.put(var29);
                  var21.put(var30);
               }

               var21.putFloat(1.0F);
               var21.putFloat(1.0F);
               var21.putFloat(var15 * (float)var34 + var31);
               var21.putFloat((float)var34 * var16 + var32);
               var21.putFloat(var33 + var17 * (float)var34);
               if(((int[])((int[])var0[1]))[9] == 0) {
                  var21.put(var29);
                  var21.put(var28);
                  var21.put(var27);
                  var21.put(var30);
               } else {
                  var21.put(var27);
                  var21.put(var28);
                  var21.put(var29);
                  var21.put(var30);
               }

               var21.putFloat(1.0F);
               var21.putFloat(0.0F);
               ++var4;
            }

            if(null != var5 && -8 == ~var5.length && var5[4].equals(Boolean.valueOf(false)) && var5[4].equals(Integer.valueOf(0))) {
               gu.b(-2, (Object[])null);
            }

            if(-65 > ~((int[])((int[])var2[8]))[var22]) {
               var24 = -64 + (((int[])((int[])var2[8]))[var22] - 1);

               for(int var38 = ((int[])((int[])var2[0]))[var24] - 1; var38 >= 0; --var38) {
                  vsa var39 = ((vsa[][])((vsa[][])var2[2]))[var24][var38];
                  int var40 = var39.A;
                  var28 = (byte)(var40 >> 16);
                  var29 = (byte)(var40 >> 8);
                  var30 = (byte)var40;
                  byte var41 = (byte)(var40 >>> 24);
                  var32 = (float)(var39.B >> 12);
                  var33 = (float)(var39.z >> 12);
                  float var42 = (float)(var39.v >> 12);
                  if(null != var0 && (var0.length == 7 || 10 == var0.length && var0[2].equals(Integer.valueOf(0)))) {
                     via.c = 0.27295294F;
                  }

                  int var35 = var39.C >> 12;
                  var21.putFloat(var32 + var12 * (float)(-var35));
                  var21.putFloat(var33 + (float)(-var35) * var13);
                  var21.putFloat((float)(-var35) * var14 + var42);
                  if(((int[])((int[])var0[1]))[9] != 0) {
                     var21.put(var28);
                     var21.put(var29);
                     var21.put(var30);
                     var21.put(var41);
                  } else {
                     var21.put(var30);
                     var21.put(var29);
                     var21.put(var28);
                     var21.put(var41);
                  }

                  var21.putFloat(0.0F);
                  var21.putFloat(0.0F);
                  var21.putFloat((float)var35 * var18 + var32);
                  var21.putFloat(var33 + var19 * (float)var35);
                  var21.putFloat(var20 * (float)var35 + var42);
                  if(-1 != ~((int[])((int[])var0[1]))[9]) {
                     var21.put(var28);
                     var21.put(var29);
                     var21.put(var30);
                     var21.put(var41);
                  } else {
                     var21.put(var30);
                     var21.put(var29);
                     var21.put(var28);
                     var21.put(var41);
                  }

                  var21.putFloat(0.0F);
                  var21.putFloat(1.0F);
                  var21.putFloat(var32 + (float)var35 * var12);
                  var21.putFloat(var13 * (float)var35 + var33);
                  var21.putFloat(var14 * (float)var35 + var42);
                  if(((int[])((int[])var0[1]))[9] != 0) {
                     var21.put(var28);
                     var21.put(var29);
                     var21.put(var30);
                     var21.put(var41);
                  } else {
                     var21.put(var30);
                     var21.put(var29);
                     var21.put(var28);
                     var21.put(var41);
                  }

                  var21.putFloat(1.0F);
                  var21.putFloat(1.0F);
                  var21.putFloat((float)var35 * var15 + var32);
                  var21.putFloat(var16 * (float)var35 + var33);
                  var21.putFloat(var17 * (float)var35 + var42);
                  if(0 == ((int[])((int[])var0[1]))[9]) {
                     var21.put(var30);
                     var21.put(var29);
                     var21.put(var28);
                     var21.put(var41);
                  } else {
                     var21.put(var28);
                     var21.put(var29);
                     var21.put(var30);
                     var21.put(var41);
                  }

                  var21.putFloat(1.0F);
                  ++var4;
                  var21.putFloat(0.0F);
               }
            }
         }
      }

      nda.a(-18243, (Object[])((Object[])var2[7]), var21.position(), 0, ((long[])((long[])var0[50]))[0]);
      hca.a(0, (Object[])((Object[])var2[7]), var0, 0);
      hca.a(1, (Object[])((Object[])var2[5]), var0, 0);
      ws.a(95, (Object[])((Object[])var2[4]), var0);
      Object[] var37 = (Object[])((Object[])var0[40]);
      csa.a(var4, var37, 0);
   }

   static final void a(int var0) {
      ++d;
      if(-1 != rq.c && ~us.b != 0) {
         if(rq.c == 1 || rq.c == 3 || us.b != rq.c && (rq.c == 0 || 0 == us.b)) {
            oqa.g = 0;
            rba.h = 0;
            ona.a(hf.g, 112);
         }

         us.b = rq.c;
         if(var0 != 0) {
            a(21, (Object[])null);
         }

      }
   }

}
