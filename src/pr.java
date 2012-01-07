
final class pr extends lm {

   private static boolean G = false;
   private static float[] s;
   private boolean Q;
   private static int q;
   private static int C;
   private int j;
   private byte[][] O;
   private int n;
   static tla[] w;
   private static float[] A;
   private static cha[] v;
   private boolean N;
   private int J;
   private static oba[] L;
   private static float[] m;
   private static float[] r;
   private static int F;
   private static int[] D;
   private static int[] E;
   private int y;
   private static boolean[] P;
   private float[] I;
   private int M;
   private byte[] B;
   private static ika[] o;
   private static int H;
   private int t;
   private static byte[] f_l;
   private static float[] z;
   private static float[] k;
   private static int[] K;
   private int u;
   private static float[] p;
   private int x;


   static final pr a(Object[] var0, int var1, int var2) {
      if(!a(var0)) {
         Class_ss.a(var2, 5, var0, var1);
         return null;
      } else {
         byte[] var3 = qn.a(var1, var2, var0, 63);
         return var3 == null?null:new pr(var3);
      }
   }

   static final int a() {
      int var0 = f_l[F] >> C & 1;
      ++C;
      F += C >> 3;
      C &= 7;
      return var0;
   }

   private static final void a(byte[] var0, int var1) {
      f_l = var0;
      F = var1;
      C = 0;
   }

   private static final boolean a(Object[] var0) {
      if(!G) {
         byte[] var1 = qn.a(0, 0, var0, -122);
         if(var1 == null) {
            return false;
         }

         a(var1);
      }

      return true;
   }

   private final float[] b(int var1) {
      a(this.O[var1], 0);
      a();
      int var2 = a(dba.a(E.length - 1, 34));
      boolean var3 = P[var2];
      int var4 = var3?H:q;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = a() != 0;
         var6 = a() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (q >> 2);
         var9 = (var4 >> 2) + (q >> 2);
         var10 = q >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (q >> 2);
         var12 = var4 - (var4 >> 2) + (q >> 2);
         var13 = q >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      oba var14 = L[E[var2]];
      int var16 = var14.b;
      int var17 = var14.d[var16];
      boolean var15 = !v[var17].a();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.a; ++var17) {
         ika var18 = o[var14.c[var17]];
         float[] var19 = k;
         var18.a(var19, var4 >> 1, var40);
      }

      int var44;
      if(!var15) {
         var17 = var14.b;
         var44 = var14.d[var17];
         v[var44].a(k, var4 >> 1);
      }

      int var41;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            k[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var44 = var4 >> 2;
         var41 = var4 >> 3;
         float[] var20 = k;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3?z:p;
         float[] var22 = var3?s:A;
         float[] var23 = var3?m:r;
         int[] var24 = var3?D:K;

         int var25;
         float var27;
         float var26;
         float var29;
         float var28;
         for(var25 = 0; var25 < var44; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var31;
         float var30;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = dba.a(var4 - 1, 105);

         int var47;
         int var49;
         int var48;
         int var52;
         for(var49 = 0; var49 < var25 - 3; ++var49) {
            var47 = var4 >> var49 + 2;
            var48 = 8 << var49;

            for(var52 = 0; var52 < 2 << var49; ++var52) {
               int var50 = var4 - var47 * 2 * var52;
               int var51 = var4 - var47 * (2 * var52 + 1);

               for(int var32 = 0; var32 < var4 >> var49 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var50 - 1 - var33];
                  float var35 = var20[var50 - 3 - var33];
                  float var36 = var20[var51 - 1 - var33];
                  float var37 = var20[var51 - 3 - var33];
                  var20[var50 - 1 - var33] = var34 + var36;
                  var20[var50 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var48];
                  float var39 = var46[var32 * var48 + 1];
                  var20[var51 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var51 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var49 = 1; var49 < var41 - 1; ++var49) {
            var47 = var24[var49];
            if(var49 < var47) {
               var48 = 8 * var49;
               var52 = 8 * var47;
               var30 = var20[var48 + 1];
               var20[var48 + 1] = var20[var52 + 1];
               var20[var52 + 1] = var30;
               var30 = var20[var48 + 3];
               var20[var48 + 3] = var20[var52 + 3];
               var20[var52 + 3] = var30;
               var30 = var20[var48 + 5];
               var20[var48 + 5] = var20[var52 + 5];
               var20[var52 + 5] = var30;
               var30 = var20[var48 + 7];
               var20[var48 + 7] = var20[var52 + 7];
               var20[var52 + 7] = var30;
            }
         }

         for(var49 = 0; var49 < var17; ++var49) {
            var20[var49] = var20[2 * var49 + 1];
         }

         for(var49 = 0; var49 < var41; ++var49) {
            var20[var4 - 1 - 2 * var49] = var20[4 * var49];
            var20[var4 - 2 - 2 * var49] = var20[4 * var49 + 1];
            var20[var4 - var44 - 1 - 2 * var49] = var20[4 * var49 + 2];
            var20[var4 - var44 - 2 - 2 * var49] = var20[4 * var49 + 3];
         }

         for(var49 = 0; var49 < var41; ++var49) {
            var27 = var23[2 * var49];
            var28 = var23[2 * var49 + 1];
            var29 = var20[var17 + 2 * var49];
            var30 = var20[var17 + 2 * var49 + 1];
            var31 = var20[var4 - 2 - 2 * var49];
            float var54 = var20[var4 - 1 - 2 * var49];
            float var53 = var28 * (var29 - var31) + var27 * (var30 + var54);
            var20[var17 + 2 * var49] = (var29 + var31 + var53) * 0.5F;
            var20[var4 - 2 - 2 * var49] = (var29 + var31 - var53) * 0.5F;
            var53 = var28 * (var30 + var54) - var27 * (var29 - var31);
            var20[var17 + 2 * var49 + 1] = (var30 - var54 + var53) * 0.5F;
            var20[var4 - 1 - 2 * var49] = (-var30 + var54 + var53) * 0.5F;
         }

         for(var49 = 0; var49 < var44; ++var49) {
            var20[var49] = var20[2 * var49 + var17] * var22[2 * var49] + var20[2 * var49 + 1 + var17] * var22[2 * var49 + 1];
            var20[var17 - 1 - var49] = var20[2 * var49 + var17] * var22[2 * var49 + 1] - var20[2 * var49 + 1 + var17] * var22[2 * var49];
         }

         for(var49 = 0; var49 < var44; ++var49) {
            var20[var4 - var44 + var49] = -var20[var49];
         }

         for(var49 = 0; var49 < var44; ++var49) {
            var20[var49] = var20[var44 + var49];
         }

         for(var49 = 0; var49 < var44; ++var49) {
            var20[var44 + var49] = -var20[var44 - var49 - 1];
         }

         for(var49 = 0; var49 < var44; ++var49) {
            var20[var17 + var49] = var20[var4 - var49 - 1];
         }

         for(var49 = var8; var49 < var9; ++var49) {
            var27 = (float)Math.sin(((double)(var49 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            k[var49] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var49 = var11; var49 < var12; ++var49) {
            var27 = (float)Math.sin(((double)(var49 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            k[var49] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var42 = null;
      if(this.y > 0) {
         var44 = this.y + var4 >> 2;
         var42 = new float[var44];
         int var45;
         if(!this.Q) {
            for(var41 = 0; var41 < this.J; ++var41) {
               var45 = (this.y >> 1) + var41;
               var42[var41] += this.I[var45];
            }
         }

         if(!var15) {
            for(var41 = var8; var41 < var4 >> 1; ++var41) {
               var45 = var42.length - (var4 >> 1) + var41;
               var42[var45] += k[var41];
            }
         }
      }

      float[] var43 = this.I;
      this.I = k;
      k = var43;
      this.y = var4;
      this.J = var12 - (var4 >> 1);
      this.Q = var15;
      return var42;
   }

   final hb a(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.B == null) {
            this.y = 0;
            this.I = new float[H];
            this.B = new byte[this.M];
            this.u = 0;
            this.t = 0;
         }

         for(; this.t < this.O.length; ++this.t) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.b(this.t);
            if(var2 != null) {
               int var3 = this.u;
               int var4 = var2.length;
               if(var4 > this.M - var3) {
                  var4 = this.M - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.B[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.u;
               }

               this.u = var3;
            }
         }

         this.I = null;
         byte[] var7 = this.B;
         this.B = null;
         return new hb(this.j, var7, this.x, this.n, this.N);
      }
   }

   static final float c(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static final int a(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - C; var0 -= var3) {
         var3 = 8 - C;
         int var4 = (1 << var3) - 1;
         var1 += (f_l[F] >> C & var4) << var2;
         C = 0;
         ++F;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (f_l[F] >> C & var3) << var2;
         C += var0;
      }

      return var1;
   }

   private final void b(byte[] var1) {
      Object[] var2 = jta.a((byte)-108, var1, new Object[3]);
      this.j = lr.a(1, var2);
      this.M = lr.a(1, var2);
      this.x = lr.a(1, var2);
      this.n = lr.a(1, var2);
      if(this.n < 0) {
         this.n = ~this.n;
         this.N = true;
      }

      int var3 = lr.a(1, var2);
      this.O = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = fh.a(var2, false);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         Class_h.a((byte)-71, var5, var2, var7, 0);
         this.O[var4] = var7;
      }

   }

   private static final void a(byte[] var0) {
      a(var0, 0);
      q = 1 << a(4);
      H = 1 << a(4);
      k = new float[H];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?H:q;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = dba.a(var5 - 1, 75);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            z = var6;
            s = var19;
            m = var20;
            D = var21;
         } else {
            p = var6;
            A = var19;
            r = var20;
            K = var21;
         }
      }

      var1 = a(8) + 1;
      w = new tla[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         w[var2] = new tla();
      }

      var2 = a(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         a(16);
      }

      var2 = a(6) + 1;
      v = new cha[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         v[var3] = new cha();
      }

      var3 = a(6) + 1;
      o = new ika[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         o[var4] = new ika();
      }

      var4 = a(6) + 1;
      L = new oba[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         L[var5] = new oba();
      }

      var5 = a(6) + 1;
      P = new boolean[var5];
      E = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         P[var18] = a() != 0;
         a(16);
         a(16);
         E[var18] = a(8);
      }

      G = true;
   }

   static final pr a(Object[] var0, int var1) {
      if(!a(var0)) {
         hp.a(-128, var0, var1);
         return null;
      } else {
         byte[] var2 = fd.a(-2, var1, var0);
         return var2 == null?null:new pr(var2);
      }
   }

   private pr(byte[] var1) {
      this.b(var1);
   }

}
