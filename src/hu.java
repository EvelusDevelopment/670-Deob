import java.nio.ByteBuffer;
import sun.misc.Unsafe;

final class hu extends ka {

   private boolean v;
   private int f_kb;
   private int f_ub;
   private int s;
   private sk w;
   private boolean t;
   private int zb;
   private short[] O;
   private static boolean f_ob;
   private int[][] I;
   private int Gb;
   private short[] f_ib;
   private static float[] L = new float[2];
   private sk K;
   private static int[] f_mb = new int[8];
   private short[] x;
   private int[] f_jb;
   private int[][] f_wb;
   private int F;
   private int D;
   private sk Q;
   private float[] Z;
   private sk f_gb;
   private static long[] M;
   private lda f_fb;
   private int[] Cb;
   private short[] f_qb;
   private Object[][] xb;
   private Object[] R;
   private short[] f_nb;
   private short[] f_lb;
   private static int[] Db = new int[8];
   private static int Hb;
   private int C;
   private int q;
   private short z;
   private short[] X;
   private fia T;
   private int Ib;
   private boolean Y;
   private int[] V;
   private short[] A;
   private int W;
   private byte[] S;
   private int G;
   private int[][] N;
   private short[] Jb;
   private short[] f_pb;
   private static int[] J = new int[1];
   private static int[] f_db = new int[1];
   private int[] Ab;
   private static bha f_hb;
   private Object[][] Eb;
   private Object[][] f_bb;
   private short[] f_cb;
   private int[] P;
   private boolean r;
   private static int f_vb;
   private short[] u;
   private int f_tb;
   private byte[] B;
   private float[] Fb;
   private int[] f_sb;
   private int U;
   private short[] f_eb;
   private int p;
   private int yb;
   private Object[][] E;
   private static int f_ab;
   private int[] H;
   private static int[] y = new int[8];
   private boolean Bb;
   private short f_rb;


   final void v(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.f_ub; ++var4) {
         if(var1 != 128) {
            this.Ab[var4] = this.Ab[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.V[var4] = this.V[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.f_jb[var4] = this.f_jb[var4] * var3 >> 7;
         }
      }

      this.j();
      this.r = false;
   }

   private static final float[] a(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final boolean XA() {
      return this.Y;
   }

   final int pa() {
      if(!this.r) {
         this.h();
      }

      return this.f_tb;
   }

   final byte[] B() {
      return this.S;
   }

   final int ra() {
      if(!this.r) {
         this.h();
      }

      return this.G;
   }

   final void a(Object[] var1, int var2, boolean var3) {
      if(this.u != null) {
         Object[] var4 = var1;
         if(var3) {
            var4 = (Object[])((Object[])this.R[6]);
            sea.a(var1, true, var4);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.f_ub; ++var6) {
            if((var2 & this.u[var6]) != 0) {
               pl.a(var4, (float)this.Ab[var6], (float)this.V[var6], (float)this.f_jb[var6], 7, var5);
               this.Ab[var6] = (int)var5[0];
               this.V[var6] = (int)var5[1];
               this.f_jb[var6] = (int)var5[2];
            }
         }

      }
   }

   final void ta(int var1, int var2, aa var3, aa var4, int var5, int var6, int var7) {
      if(!this.r) {
         this.h();
      }

      int var8 = var5 + this.Gb;
      int var9 = var5 + this.U;
      int var10 = var7 + this.D;
      int var11 = var7 + this.f_kb;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.g >> var3.a < var3.f_i && var10 >= 0 && var11 + var3.g >> var3.a < var3.h) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.a;
            var9 = var9 + (var3.g - 1) >> var3.a;
            var10 >>= var3.a;
            var11 = var11 + (var3.g - 1) >> var3.a;
            if(var3.b(-95, var10, var8) == var6 && var3.b(-120, var10, var9) == var6 && var3.b(-74, var11, var8) == var6 && var3.b(-51, var11, var9) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.g >> var4.a >= var4.f_i || var10 < 0 || var11 + var4.g >> var4.a >= var4.h) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.f_ub; ++var12) {
               this.V[var12] = this.V[var12] + var3.a(1, this.Ab[var12] + var5, this.f_jb[var12] + var7) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               var12 = this.f_tb;
               if(var12 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.f_ub; ++var13) {
                  var14 = (this.V[var13] << 16) / var12;
                  if(var14 < var2) {
                     this.V[var13] += (var3.a(1, this.Ab[var13] + var5, this.f_jb[var13] + var7) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 4;
                  var13 = (var2 >> 8 & 255) * 4;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.g >= var3.f_i << var3.a || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.g >= var3.h << var3.a) {
                     return;
                  }

                  this.a(var12, var15, var3, var13, var7, (byte)126, var6, var14, var5);
               } else if(var1 == 4) {
                  var12 = this.q - this.f_tb;

                  for(var13 = 0; var13 < this.f_ub; ++var13) {
                     this.V[var13] = this.V[var13] + (var4.a(1, this.Ab[var13] + var5, this.f_jb[var13] + var7) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.q - this.f_tb;

                  for(var13 = 0; var13 < this.f_ub; ++var13) {
                     var14 = this.Ab[var13] + var5;
                     var15 = this.f_jb[var13] + var7;
                     int var16 = var3.a(1, var14, var15);
                     int var17 = var4.a(1, var14, var15);
                     int var18 = var16 - var17 - var2;
                     this.V[var13] = ((this.V[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         this.j();
         this.r = false;
      }
   }

   final int da() {
      if(!this.r) {
         this.h();
      }

      return this.D;
   }

   private final void o() {
      if(this.T != null) {
         this.T.c = false;
      }

   }

   final boolean QA() {
      if(this.N == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.p; ++var1) {
            this.Ab[var1] <<= 4;
            this.V[var1] <<= 4;
            this.f_jb[var1] <<= 4;
         }

         Hb = 0;
         f_ab = 0;
         f_vb = 0;
         return true;
      }
   }

   private final int a(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   private final void h() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.f_ub; ++var9) {
         int var10 = this.Ab[var9];
         int var11 = this.V[var9];
         int var12 = this.f_jb[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.Gb = var1;
      this.U = var4;
      this.f_tb = var2;
      this.q = var5;
      this.D = var3;
      this.f_kb = var6;
      this.zb = (int)(Math.sqrt((double)var7) + 0.99D);
      this.G = (int)(Math.sqrt((double)var8) + 0.99D);
      this.r = true;
   }

   hu(Object[] var1, ii var2, int var3, int var4, int var5, int var6) {
      this(var1, var3, var6, true, false);
      qa var8 = ((ta)(var1 == null?null:var1[38])).k;
      int[] var9 = new int[var2.I];
      this.P = new int[var2.g + 1];

      for(int var10 = 0; var10 < var2.I; ++var10) {
         if(var2.C == null || var2.C[var10] != 2) {
            if(var2.y != null && var2.y[var10] != -1) {
               Object[] var11 = var8.a(var2.y[var10] & '\uffff', (byte)110);
               if(((this.F & 64) == 0 || !((boolean[])((boolean[])var11[3]))[7]) && ((boolean[])((boolean[])var11[3]))[3]) {
                  continue;
               }
            }

            var9[this.C++] = var10;
            ++this.P[var2.p[var10]];
            ++this.P[var2.b[var10]];
            ++this.P[var2.J[var10]];
         }
      }

      this.yb = this.C;
      long[] var65 = new long[this.C];
      boolean var64 = (this.W & 256) != 0;

      int var13;
      Object[] var14;
      int var15;
      int var20;
      Object[] var23;
      int var67;
      short var75;
      for(int var12 = 0; var12 < this.C; ++var12) {
         var13 = var9[var12];
         var14 = null;
         var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         if(var2.v != null) {
            boolean var19 = false;

            for(var20 = 0; var20 < var2.v.length; ++var20) {
               Object[] var21 = var2.v[var20];
               if(var13 == ((int[])((int[])var21[0]))[3]) {
                  Object[] var22 = hsa.a(((int[])((int[])var21[0]))[0], -82);
                  if(((boolean[])((boolean[])var22[0]))[0]) {
                     var19 = true;
                  }

                  if(((int[])((int[])var22[1]))[1] != -1) {
                     var23 = var8.a(((int[])((int[])var22[1]))[1], (byte)97);
                     if(((int[])((int[])var23[1]))[0] == 2) {
                        this.Y = true;
                     }
                  }
               }
            }

            if(var19) {
               var65[var12] = Long.MAX_VALUE;
               --this.yb;
               continue;
            }
         }

         var75 = -1;
         if(var2.y != null) {
            var75 = var2.y[var13];
            if(var75 != -1) {
               var14 = var8.a(var75 & '\uffff', (byte)52);
               if((this.F & 64) != 0 && ((boolean[])((boolean[])var14[3]))[7]) {
                  var75 = -1;
                  var14 = null;
               } else {
                  var17 = ((byte[])((byte[])var14[0]))[4];
                  var18 = ((byte[])((byte[])var14[0]))[0];
               }
            }
         }

         boolean var74 = var2.d != null && var2.d[var13] != 0 || var14 != null && ((int[])((int[])var14[1]))[0] != 0;
         if((var64 || var74) && var2.D != null) {
            var15 += var2.D[var13] << 17;
         }

         if(var74) {
            var15 += 65536;
         }

         var15 += (var17 & 255) << 8;
         var15 += var18 & 255;
         var67 = var16 + ((var75 & '\uffff') << 16);
         var67 += var12 & '\uffff';
         var65[var12] = ((long)var15 << 32) + (long)var67;
         this.Y |= var74;
         this.t |= var14 != null && (((byte[])((byte[])var14[0]))[5] != 0 || ((byte[])((byte[])var14[0]))[6] != 0);
      }

      cv.a(var9, (byte)9, var65);
      this.p = var2.u;
      this.f_ub = var2.g;
      this.Ab = var2.f_l;
      this.V = var2.h;
      this.f_jb = var2.z;
      this.u = var2.e;
      qq[] var66 = new qq[this.f_ub];
      this.E = var2.s;
      this.xb = var2.q;
      int var69;
      Object[] var70;
      if(var2.v != null) {
         this.Ib = var2.v.length;
         this.Eb = new Object[this.Ib][];
         this.f_bb = new Object[this.Ib][];

         for(var13 = 0; var13 < this.Ib; ++var13) {
            var14 = var2.v[var13];
            var70 = hsa.a(((int[])((int[])var14[0]))[0], -51);
            var67 = -1;

            for(var69 = 0; var69 < this.C; ++var69) {
               if(var9[var69] == ((int[])((int[])var14[0]))[3]) {
                  var67 = var69;
                  break;
               }
            }

            if(var67 == -1) {
               throw new RuntimeException();
            }

            var69 = tpa.f[var2.A[((int[])((int[])var14[0]))[3]] & '\uffff'] & 16777215;
            var69 |= 255 - (var2.d != null?var2.d[((int[])((int[])var14[0]))[3]]:0) << 24;
            this.Eb[var13] = Class_f.a(((int[])((int[])var70[1]))[0], 1, new Object[3], ((int[])((int[])var70[1]))[2], ((boolean[])((boolean[])var70[0]))[1], ((int[])((int[])var70[1]))[4], ((int[])((int[])var70[1]))[3], ((boolean[])((boolean[])var70[0]))[0], var2.J[((int[])((int[])var14[0]))[3]], ((int[])((int[])var70[1]))[1], var67, var2.p[((int[])((int[])var14[0]))[3]], var2.b[((int[])((int[])var14[0]))[3]], ((int[])((int[])var14[0]))[2]);
            this.f_bb[var13] = hw.a(var69, new Object[1], 3124);
         }
      }

      var13 = this.C * 3;
      this.f_qb = new short[var13];
      this.X = new short[var13];
      this.Jb = new short[var13];
      this.f_eb = new short[var13];
      this.f_ib = new short[var13];
      this.B = new byte[var13];
      this.Z = new float[var13];
      this.Fb = new float[var13];
      this.f_pb = new short[this.C];
      this.S = new byte[this.C];
      this.x = new short[this.C];
      this.f_lb = new short[this.C];
      this.f_nb = new short[this.C];
      this.O = new short[this.C];
      if(var2.x != null) {
         this.f_cb = new short[this.C];
      }

      this.f_rb = (short)var4;
      this.z = (short)var5;
      this.A = new short[var13];
      M = new long[var13];
      int var68 = 0;

      for(var15 = 0; var15 < var2.g; ++var15) {
         var67 = this.P[var15];
         this.P[var15] = var68;
         var68 += var67;
         var66[var15] = new qq();
      }

      this.P[var2.g] = var68;
      var70 = gba.a(var2, -30075, this.C, var9);
      dva[] var73 = new dva[var2.I];

      short var72;
      short var80;
      int var82;
      for(var69 = 0; var69 < var2.I; ++var69) {
         var72 = var2.p[var69];
         var75 = var2.b[var69];
         var80 = var2.J[var69];
         var82 = this.Ab[var75] - this.Ab[var72];
         int var77 = this.V[var75] - this.V[var72];
         int var79 = this.f_jb[var75] - this.f_jb[var72];
         int var24 = this.Ab[var80] - this.Ab[var72];
         int var25 = this.V[var80] - this.V[var72];
         int var26 = this.f_jb[var80] - this.f_jb[var72];
         int var27 = var77 * var26 - var25 * var79;
         int var28 = var79 * var24 - var26 * var82;

         int var29;
         for(var29 = var82 * var25 - var24 * var77; var27 > 8192 || var28 > 8192 || var29 > 8192 || var27 < -8192 || var28 < -8192 || var29 < -8192; var29 >>= 1) {
            var27 >>= 1;
            var28 >>= 1;
         }

         int var30 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28 + var29 * var29));
         if(var30 <= 0) {
            var30 = 1;
         }

         var27 = var27 * 256 / var30;
         var28 = var28 * 256 / var30;
         var29 = var29 * 256 / var30;
         byte var31 = var2.C == null?0:var2.C[var69];
         if(var31 == 0) {
            qq var32 = var66[var72];
            var32.d += var27;
            var32.c += var28;
            var32.b += var29;
            ++var32.a;
            var32 = var66[var75];
            var32.d += var27;
            var32.c += var28;
            var32.b += var29;
            ++var32.a;
            var32 = var66[var80];
            var32.d += var27;
            var32.c += var28;
            var32.b += var29;
            ++var32.a;
         } else if(var31 == 1) {
            dva var96 = var73[var69] = new dva();
            var96.b = var27;
            var96.a = var28;
            var96.c = var29;
         }
      }

      int var71;
      short var78;
      int var81;
      for(var69 = 0; var69 < this.C; ++var69) {
         var71 = var9[var69];
         var81 = var2.A[var71] & '\uffff';
         if(var2.n == null) {
            var20 = -1;
         } else {
            var20 = var2.n[var71];
         }

         if(var2.d == null) {
            var82 = 0;
         } else {
            var82 = var2.d[var71] & 255;
         }

         var78 = var2.y == null?-1:var2.y[var71];
         if(var78 != -1 && (this.F & 64) != 0) {
            var23 = var8.a(var78 & '\uffff', (byte)106);
            if(((boolean[])((boolean[])var23[3]))[7]) {
               var78 = -1;
            }
         }

         float var85 = 0.0F;
         float var86 = 0.0F;
         float var84 = 0.0F;
         float var89 = 0.0F;
         float var87 = 0.0F;
         float var92 = 0.0F;
         byte var93 = 0;
         byte var91 = 0;
         int var90 = 0;
         short var35;
         short var36;
         short var37;
         byte var97;
         if(var78 != -1) {
            if(var20 == -1) {
               var85 = 0.0F;
               var86 = 1.0F;
               var84 = 1.0F;
               var89 = 1.0F;
               var93 = 1;
               var87 = 0.0F;
               var92 = 0.0F;
               var91 = 2;
            } else {
               var20 &= 255;
               var97 = var2.G[var20];
               short var34;
               short var33;
               float var42;
               float var43;
               float var41;
               float var55;
               float var54;
               float var53;
               float var58;
               float var57;
               float var56;
               if(var97 == 0) {
                  var33 = var2.p[var71];
                  var34 = var2.b[var71];
                  var35 = var2.J[var71];
                  var36 = var2.r[var20];
                  var37 = var2.F[var20];
                  short var38 = var2.E[var20];
                  float var39 = (float)var2.f_l[var36];
                  float var40 = (float)var2.h[var36];
                  var41 = (float)var2.z[var36];
                  var42 = (float)var2.f_l[var37] - var39;
                  var43 = (float)var2.h[var37] - var40;
                  float var44 = (float)var2.z[var37] - var41;
                  float var45 = (float)var2.f_l[var38] - var39;
                  float var46 = (float)var2.h[var38] - var40;
                  float var47 = (float)var2.z[var38] - var41;
                  float var48 = (float)var2.f_l[var33] - var39;
                  float var49 = (float)var2.h[var33] - var40;
                  float var50 = (float)var2.z[var33] - var41;
                  float var51 = (float)var2.f_l[var34] - var39;
                  float var52 = (float)var2.h[var34] - var40;
                  var53 = (float)var2.z[var34] - var41;
                  var54 = (float)var2.f_l[var35] - var39;
                  var55 = (float)var2.h[var35] - var40;
                  var56 = (float)var2.z[var35] - var41;
                  var57 = var43 * var47 - var44 * var46;
                  var58 = var44 * var45 - var42 * var47;
                  float var59 = var42 * var46 - var43 * var45;
                  float var60 = var46 * var59 - var47 * var58;
                  float var61 = var47 * var57 - var45 * var59;
                  float var62 = var45 * var58 - var46 * var57;
                  float var63 = 1.0F / (var60 * var42 + var61 * var43 + var62 * var44);
                  var85 = (var60 * var48 + var61 * var49 + var62 * var50) * var63;
                  var84 = (var60 * var51 + var61 * var52 + var62 * var53) * var63;
                  var87 = (var60 * var54 + var61 * var55 + var62 * var56) * var63;
                  var60 = var43 * var59 - var44 * var58;
                  var61 = var44 * var57 - var42 * var59;
                  var62 = var42 * var58 - var43 * var57;
                  var63 = 1.0F / (var60 * var45 + var61 * var46 + var62 * var47);
                  var86 = (var60 * var48 + var61 * var49 + var62 * var50) * var63;
                  var89 = (var60 * var51 + var61 * var52 + var62 * var53) * var63;
                  var92 = (var60 * var54 + var61 * var55 + var62 * var56) * var63;
               } else {
                  var33 = var2.p[var71];
                  var34 = var2.b[var71];
                  var35 = var2.J[var71];
                  int var98 = ((int[])((int[])var70[1]))[var20];
                  int var103 = ((int[])((int[])var70[0]))[var20];
                  int var102 = ((int[])((int[])var70[3]))[var20];
                  float[] var100 = ((float[][])((float[][])var70[2]))[var20];
                  byte var104 = var2.K[var20];
                  var41 = (float)var2.B[var20] / 256.0F;
                  if(var97 == 1) {
                     var42 = (float)var2.t[var20] / 1024.0F;
                     uta.a(var100, var98, var2.h[var33], var104, var41, L, var103, var2.z[var33], var42, (byte)-121, var102, var2.f_l[var33]);
                     var85 = L[0];
                     var86 = L[1];
                     uta.a(var100, var98, var2.h[var34], var104, var41, L, var103, var2.z[var34], var42, (byte)-121, var102, var2.f_l[var34]);
                     var84 = L[0];
                     var89 = L[1];
                     uta.a(var100, var98, var2.h[var35], var104, var41, L, var103, var2.z[var35], var42, (byte)-121, var102, var2.f_l[var35]);
                     var87 = L[0];
                     var92 = L[1];
                     var43 = var42 / 2.0F;
                     if((var104 & 1) == 0) {
                        if(var84 - var85 > var43) {
                           var84 -= var42;
                           var93 = 1;
                        } else if(var85 - var84 > var43) {
                           var84 += var42;
                           var93 = 2;
                        }

                        if(var87 - var85 > var43) {
                           var87 -= var42;
                           var91 = 1;
                        } else if(var85 - var87 > var43) {
                           var87 += var42;
                           var91 = 2;
                        }
                     } else {
                        if(var89 - var86 > var43) {
                           var89 -= var42;
                           var93 = 1;
                        } else if(var86 - var89 > var43) {
                           var89 += var42;
                           var93 = 2;
                        }

                        if(var92 - var86 > var43) {
                           var92 -= var42;
                           var91 = 1;
                        } else if(var86 - var92 > var43) {
                           var92 += var42;
                           var91 = 2;
                        }
                     }
                  } else if(var97 == 2) {
                     var42 = (float)var2.w[var20] / 256.0F;
                     var43 = (float)var2.o[var20] / 256.0F;
                     int var108 = var2.f_l[var34] - var2.f_l[var33];
                     int var105 = var2.h[var34] - var2.h[var33];
                     int var106 = var2.z[var34] - var2.z[var33];
                     int var107 = var2.f_l[var35] - var2.f_l[var33];
                     int var112 = var2.h[var35] - var2.h[var33];
                     int var113 = var2.z[var35] - var2.z[var33];
                     int var109 = var105 * var113 - var112 * var106;
                     int var110 = var106 * var107 - var113 * var108;
                     int var111 = var108 * var112 - var107 * var105;
                     var53 = 64.0F / (float)var2.H[var20];
                     var54 = 64.0F / (float)var2.j[var20];
                     var55 = 64.0F / (float)var2.t[var20];
                     var56 = ((float)var109 * var100[0] + (float)var110 * var100[1] + (float)var111 * var100[2]) / var53;
                     var57 = ((float)var109 * var100[3] + (float)var110 * var100[4] + (float)var111 * var100[5]) / var54;
                     var58 = ((float)var109 * var100[6] + (float)var110 * var100[7] + (float)var111 * var100[8]) / var55;
                     var90 = oka.a(var57, var56, var58, (byte)-118);
                     vha.a(var42, var43, var98, var100, var103, var2.h[var33], (byte)-112, var104, var2.f_l[var33], var90, L, var102, var2.z[var33], var41);
                     var85 = L[0];
                     var86 = L[1];
                     vha.a(var42, var43, var98, var100, var103, var2.h[var34], (byte)-99, var104, var2.f_l[var34], var90, L, var102, var2.z[var34], var41);
                     var84 = L[0];
                     var89 = L[1];
                     vha.a(var42, var43, var98, var100, var103, var2.h[var35], (byte)-116, var104, var2.f_l[var35], var90, L, var102, var2.z[var35], var41);
                     var87 = L[0];
                     var92 = L[1];
                  } else if(var97 == 3) {
                     ai.a(var2.h[var33], var104, var2.z[var33], var100, 4, var102, var41, var2.f_l[var33], var98, var103, L);
                     var85 = L[0];
                     var86 = L[1];
                     ai.a(var2.h[var34], var104, var2.z[var34], var100, 4, var102, var41, var2.f_l[var34], var98, var103, L);
                     var84 = L[0];
                     var89 = L[1];
                     ai.a(var2.h[var35], var104, var2.z[var35], var100, 4, var102, var41, var2.f_l[var35], var98, var103, L);
                     var87 = L[0];
                     var92 = L[1];
                     if((var104 & 1) == 0) {
                        if(var84 - var85 > 0.5F) {
                           --var84;
                           var93 = 1;
                        } else if(var85 - var84 > 0.5F) {
                           ++var84;
                           var93 = 2;
                        }

                        if(var87 - var85 > 0.5F) {
                           --var87;
                           var91 = 1;
                        } else if(var85 - var87 > 0.5F) {
                           ++var87;
                           var91 = 2;
                        }
                     } else {
                        if(var89 - var86 > 0.5F) {
                           --var89;
                           var93 = 1;
                        } else if(var86 - var89 > 0.5F) {
                           ++var89;
                           var93 = 2;
                        }

                        if(var92 - var86 > 0.5F) {
                           --var92;
                           var91 = 1;
                        } else if(var86 - var92 > 0.5F) {
                           ++var92;
                           var91 = 2;
                        }
                     }
                  }
               }
            }
         }

         if(var2.C == null) {
            var97 = 0;
         } else {
            var97 = var2.C[var71];
         }

         if(var97 == 0) {
            long var94 = (long)(var20 << 2) + ((long)(var90 << 24) + (long)(var81 << 8) + (long)var82 << 32);
            var35 = var2.p[var71];
            var36 = var2.b[var71];
            var37 = var2.J[var71];
            qq var101 = var66[var35];
            this.x[var69] = this.a(var2, var35, var69, var94, var101.d, var101.c, var101.b, var101.a, var85, var86);
            var101 = var66[var36];
            this.f_lb[var69] = this.a(var2, var36, var69, var94 + (long)var93, var101.d, var101.c, var101.b, var101.a, var84, var89);
            var101 = var66[var37];
            this.f_nb[var69] = this.a(var2, var37, var69, var94 + (long)var91, var101.d, var101.c, var101.b, var101.a, var87, var92);
         } else if(var97 == 1) {
            dva var95 = var73[var71];
            long var99 = (long)((var20 << 2) + (var95.b > 0?1024:2048) + (var95.a + 256 << 12) + (var95.c + 256 << 22)) + ((long)(var90 << 24) + (long)(var81 << 8) + (long)var82 << 32);
            this.x[var69] = this.a(var2, var2.p[var71], var69, var99, var95.b, var95.a, var95.c, 0, var85, var86);
            this.f_lb[var69] = this.a(var2, var2.b[var71], var69, var99 + (long)var93, var95.b, var95.a, var95.c, 0, var84, var89);
            this.f_nb[var69] = this.a(var2, var2.J[var71], var69, var99 + (long)var91, var95.b, var95.a, var95.c, 0, var87, var92);
         }

         if(var2.d != null) {
            this.S[var69] = var2.d[var71];
         }

         if(var2.x != null) {
            this.f_cb[var69] = var2.x[var71];
         }

         this.f_pb[var69] = var2.A[var71];
         this.O[var69] = var78;
      }

      if(this.yb > 0) {
         var69 = 1;
         var72 = this.O[0];

         for(var81 = 0; var81 < this.yb; ++var81) {
            var80 = this.O[var81];
            if(var80 != var72) {
               ++var69;
               var72 = var80;
            }
         }

         this.H = new int[var69];
         this.f_sb = new int[var69];
         this.Cb = new int[var69 + 1];
         this.Cb[0] = 0;
         var81 = this.s;
         var80 = 0;
         var69 = 0;
         var72 = this.O[0];

         for(var82 = 0; var82 < this.yb; ++var82) {
            var78 = this.O[var82];
            if(var78 != var72) {
               this.H[var69] = var81;
               this.f_sb[var69] = var80 - var81 + 1;
               ++var69;
               this.Cb[var69] = var82;
               var81 = this.s;
               var80 = 0;
               var72 = var78;
            }

            short var88 = this.x[var82];
            if(var88 < var81) {
               var81 = var88;
            }

            if(var88 > var80) {
               var80 = var88;
            }

            var88 = this.f_lb[var82];
            if(var88 < var81) {
               var81 = var88;
            }

            if(var88 > var80) {
               var80 = var88;
            }

            var88 = this.f_nb[var82];
            if(var88 < var81) {
               var81 = var88;
            }

            if(var88 > var80) {
               var80 = var88;
            }
         }

         this.H[var69] = var81;
         this.f_sb[var69] = var80 - var81 + 1;
         ++var69;
         this.Cb[var69] = this.yb;
      }

      M = null;
      this.f_qb = a(this.f_qb, this.s);
      this.X = a(this.X, this.s);
      this.Jb = a(this.Jb, this.s);
      this.f_eb = a(this.f_eb, this.s);
      this.f_ib = a(this.f_ib, this.s);
      this.B = a(this.B, this.s);
      this.Z = a(this.Z, this.s);
      this.Fb = a(this.Fb, this.s);
      boolean var76;
      if(var2.f_i != null) {
         var76 = 0 != (var3 & 32);
         if(var76) {
            this.N = var2.a(false);
         }
      }

      if(var2.v != null) {
         var76 = -1 != ~(1024 & var3);
         if(var76) {
            this.I = var2.b();
         }
      }

      if(var2.m != null) {
         var76 = 0 != (var3 & 384);
         if(var76) {
            var71 = 0;
            int[] var83 = new int[256];

            for(var20 = 0; var20 < this.C; ++var20) {
               var82 = var2.m[var9[var20]];
               if(var82 >= 0) {
                  ++var83[var82];
                  if(var82 > var71) {
                     var71 = var82;
                  }
               }
            }

            this.f_wb = new int[var71 + 1][];

            for(var20 = 0; var20 <= var71; ++var20) {
               this.f_wb[var20] = new int[var83[var20]];
               var83[var20] = 0;
            }

            for(var20 = 0; var20 < this.C; ++var20) {
               var82 = var2.m[var9[var20]];
               if(var82 >= 0) {
                  this.f_wb[var82][var83[var82]++] = var20;
               }
            }
         }
      }

   }

   private final short a(ii var1, int var2, int var3, long var4, int var6, int var7, int var8, int var9, float var10, float var11) {
      int var12 = this.P[var2];
      int var13 = this.P[var2 + 1];
      int var14 = 0;

      for(int var15 = var12; var15 < var13; ++var15) {
         short var16 = this.A[var15];
         if(var16 == 0) {
            var14 = var15;
            break;
         }

         if(M[var15] == var4) {
            return (short)(var16 - 1);
         }
      }

      this.A[var14] = (short)(this.s + 1);
      M[var14] = var4;
      this.X[this.s] = (short)var3;
      this.f_qb[this.s] = (short)var2;
      this.Jb[this.s] = (short)var6;
      this.f_eb[this.s] = (short)var7;
      this.f_ib[this.s] = (short)var8;
      this.B[this.s] = (byte)var9;
      this.Z[this.s] = var10;
      this.Fb[this.s] = var11;
      return (short)(this.s++);
   }

   final void EA(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.f_ub; ++var4) {
         var5 = this.f_jb[var4] * var2 + this.Ab[var4] * var3 >> 14;
         this.f_jb[var4] = this.f_jb[var4] * var3 - this.Ab[var4] * var2 >> 14;
         this.Ab[var4] = var5;
      }

      for(var4 = 0; var4 < this.s; ++var4) {
         var5 = this.f_ib[var4] * var2 + this.Jb[var4] * var3 >> 14;
         this.f_ib[var4] = (short)(this.f_ib[var4] * var3 - this.Jb[var4] * var2 >> 14);
         this.Jb[var4] = (short)var5;
      }

      this.j();
      this.l();
      this.r = false;
   }

   private final void l() {
      if((this.F & 55) != 0) {
         if(this.f_gb != null) {
            this.f_gb.b = false;
         }
      } else if(this.w != null) {
         this.w.b = false;
      }

   }

   final int va() {
      return this.W;
   }

   private final boolean i() {
      boolean var1 = !this.w.b;
      boolean var2 = (this.F & 55) != 0 && !this.f_gb.b;
      boolean var3 = !this.Q.b;
      boolean var4 = !this.K.b;
      if(!var3 && !var1 && !var2 && !var4) {
         return true;
      } else {
         boolean var5 = true;
         Object[] var6;
         Unsafe var7;
         int var8;
         long var9;
         int var11;
         short var12;
         ByteBuffer var30;
         int var33;
         if(var3) {
            if(this.f_qb == null) {
               return true;
            }

            if(this.Q.c == null) {
               this.Q.c = mc.a(-119, this.R, this.Bb);
            }

            var6 = this.Q.c;
            lm.a(12, var6, this.s * 12, -26241);
            var7 = (Unsafe)this.R[36];
            if(var7 != null) {
               var8 = this.s * 3 * 4;
               var9 = ih.a(0, var6, var8, (byte)-123);

               for(var11 = 0; var11 < this.s; ++var11) {
                  var12 = this.f_qb[var11];
                  var7.putFloat(var9, (float)this.Ab[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.V[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.f_jb[var12]);
                  var9 += 4L;
               }

               oka.a(true, var6);
            } else {
               var30 = (ByteBuffer)this.R[57];
               var30.clear();

               for(var33 = 0; var33 < this.s; ++var33) {
                  var30.putFloat((float)this.Ab[this.f_qb[var33]]);
                  var30.putFloat((float)this.V[this.f_qb[var33]]);
                  var30.putFloat((float)this.f_jb[this.f_qb[var33]]);
               }

               nda.a(-18243, var6, var30.position(), 0, ((long[])((long[])this.R[50]))[0]);
            }

            this.Q.d = var6;
            this.Q.b = true;
         }

         int var17;
         float var16;
         float var21;
         float var20;
         short[] var37;
         int var43;
         float var50;
         float var52;
         if(var1) {
            if(this.w.c == null) {
               this.w.c = mc.a(-108, this.R, this.Bb);
            }

            var6 = this.w.c;
            lm.a(4, var6, this.s * 4, -26241);
            var7 = (Unsafe)this.R[36];
            float var22;
            int var26;
            short[] var35;
            if(var7 != null) {
               var8 = this.s * 1 * 4;
               var9 = ih.a(0, var6, var8, (byte)-111);
               if((this.F & 55) == 0) {
                  short[] var13;
                  byte[] var14;
                  short[] var34;
                  if(this.f_fb != null) {
                     var35 = this.f_fb.b;
                     var34 = this.f_fb.c;
                     var13 = this.f_fb.a;
                     var14 = this.f_fb.d;
                  } else {
                     var35 = this.Jb;
                     var34 = this.f_eb;
                     var13 = this.f_ib;
                     var14 = this.B;
                  }

                  float var15 = ((float[])((float[])this.R[0]))[8] * 768.0F / (float)this.z;
                  var16 = ((float[])((float[])this.R[0]))[0] * 768.0F / (float)this.z;

                  for(var17 = 0; var17 < this.s; ++var17) {
                     short var18 = this.X[var17];
                     int var19 = this.a(this.f_pb[var18] & '\uffff', this.O[var18], this.f_rb);
                     var20 = (float)(var19 >> 16 & 255) * ((float[])((float[])this.R[0]))[11];
                     var21 = (float)(var19 >> 8 & 255) * ((float[])((float[])this.R[0]))[2];
                     var22 = (float)(var19 & 255) * ((float[])((float[])this.R[0]))[3];
                     byte var23 = var14[var17];
                     float var24;
                     if(var23 == 0) {
                        var24 = (((float[])((float[])this.R[53]))[0] * (float)var35[var17] + ((float[])((float[])this.R[53]))[1] * (float)var34[var17] + ((float[])((float[])this.R[53]))[2] * (float)var13[var17]) * 0.0026041667F;
                     } else {
                        var24 = (((float[])((float[])this.R[53]))[0] * (float)var35[var17] + ((float[])((float[])this.R[53]))[1] * (float)var34[var17] + ((float[])((float[])this.R[53]))[2] * (float)var13[var17]) / ((float)var23 * 256.0F);
                     }

                     float var25 = ((float[])((float[])this.R[0]))[17] + var24 * (var24 < 0.0F?var16:var15);
                     var26 = (int)(var20 * var25);
                     if(var26 < 0) {
                        var26 = 0;
                     } else if(var26 > 255) {
                        var26 = 255;
                     }

                     int var27 = (int)(var21 * var25);
                     if(var27 < 0) {
                        var27 = 0;
                     } else if(var27 > 255) {
                        var27 = 255;
                     }

                     int var28 = (int)(var22 * var25);
                     if(var28 < 0) {
                        var28 = 0;
                     } else if(var28 > 255) {
                        var28 = 255;
                     }

                     var7.putInt(var9, 255 - this.S[var18] << 24 | var26 << 16 | var27 << 8 | var28);
                     var9 += 4L;
                  }
               } else {
                  for(var11 = 0; var11 < this.s; ++var11) {
                     var12 = this.X[var11];
                     int var45 = 255 - this.S[var12] << 24 | this.a(this.f_pb[var12] & '\uffff', this.O[var12], this.f_rb);
                     var7.putInt(var9, var45);
                     var9 += 4L;
                  }
               }

               oka.a(true, var6);
            } else {
               var30 = (ByteBuffer)this.R[57];
               var30.clear();
               if((this.F & 55) == 0) {
                  short[] var10;
                  byte[] var38;
                  if(this.f_fb != null) {
                     var37 = this.f_fb.b;
                     var10 = this.f_fb.c;
                     var35 = this.f_fb.a;
                     var38 = this.f_fb.d;
                  } else {
                     var37 = this.Jb;
                     var10 = this.f_eb;
                     var35 = this.f_ib;
                     var38 = this.B;
                  }

                  float var46 = ((float[])((float[])this.R[0]))[8] * 768.0F / (float)this.z;
                  float var39 = ((float[])((float[])this.R[0]))[0] * 768.0F / (float)this.z;

                  for(var43 = 0; var43 < this.s; ++var43) {
                     short var47 = this.X[var43];
                     var17 = this.a(this.f_pb[var47] & '\uffff', this.O[var47], this.f_rb);
                     var52 = (float)(var17 >> 16 & 255) * ((float[])((float[])this.R[0]))[11];
                     var50 = (float)(var17 >> 8 & 255) * ((float[])((float[])this.R[0]))[2];
                     var20 = (float)(var17 & 255) * ((float[])((float[])this.R[0]))[3];
                     byte var54 = var38[var43];
                     if(var54 == 0) {
                        var22 = (((float[])((float[])this.R[53]))[0] * (float)var37[var43] + ((float[])((float[])this.R[53]))[1] * (float)var10[var43] + ((float[])((float[])this.R[53]))[2] * (float)var35[var43]) * 0.0026041667F;
                     } else {
                        var22 = (((float[])((float[])this.R[53]))[0] * (float)var37[var43] + ((float[])((float[])this.R[53]))[1] * (float)var10[var43] + ((float[])((float[])this.R[53]))[2] * (float)var35[var43]) / ((float)var54 * 256.0F);
                     }

                     float var53 = ((float[])((float[])this.R[0]))[17] + var22 * (var22 < 0.0F?var39:var46);
                     int var55 = (int)(var52 * var53);
                     if(var55 < 0) {
                        var55 = 0;
                     } else if(var55 > 255) {
                        var55 = 255;
                     }

                     int var56 = (int)(var50 * var53);
                     if(var56 < 0) {
                        var56 = 0;
                     } else if(var56 > 255) {
                        var56 = 255;
                     }

                     var26 = (int)(var20 * var53);
                     if(var26 < 0) {
                        var26 = 0;
                     } else if(var26 > 255) {
                        var26 = 255;
                     }

                     var30.putInt(255 - this.S[var47] << 24 | var55 << 16 | var56 << 8 | var26);
                  }
               } else {
                  for(var33 = 0; var33 < this.s; ++var33) {
                     short var32 = this.X[var33];
                     var11 = 255 - this.S[var32] << 24 | this.a(this.f_pb[var32] & '\uffff', this.O[var32], this.f_rb);
                     var30.putInt(var11);
                  }
               }

               nda.a(-18243, var6, var30.position(), 0, ((long[])((long[])this.R[50]))[0]);
            }

            this.w.d = var6;
            this.w.b = true;
         }

         if(var2) {
            if(this.f_gb.c == null) {
               this.f_gb.c = mc.a(-100, this.R, this.Bb);
            }

            var6 = this.f_gb.c;
            lm.a(12, var6, this.s * 12, -26241);
            short[] var29;
            short[] var31;
            byte[] var36;
            if(this.f_fb != null) {
               var29 = this.f_fb.b;
               var31 = this.f_fb.c;
               var37 = this.f_fb.a;
               var36 = this.f_fb.d;
            } else {
               var29 = this.Jb;
               var31 = this.f_eb;
               var37 = this.f_ib;
               var36 = this.B;
            }

            float var44 = 3.0F / (float)this.z;
            float var41 = 3.0F / (float)(this.z + this.z / 2);
            Unsafe var40 = (Unsafe)this.R[36];
            if(var40 != null) {
               int var42 = this.s * 3 * 4;
               long var48 = ih.a(0, var6, var42, (byte)-99);

               for(var17 = 0; var17 < this.s; ++var17) {
                  var21 = var36[var17] == 0?var41:var44 / (float)var36[var17];
                  var52 = (float)var29[var17] * var21;
                  var50 = (float)var31[var17] * var21;
                  var20 = (float)var37[var17] * var21;
                  var40.putFloat(var48, var52);
                  var48 += 4L;
                  var40.putFloat(var48, var50);
                  var48 += 4L;
                  var40.putFloat(var48, var20);
                  var48 += 4L;
               }

               oka.a(true, var6);
            } else {
               ByteBuffer var49 = (ByteBuffer)this.R[57];
               var49.clear();

               for(var43 = 0; var43 < this.s; ++var43) {
                  var50 = var36[var43] == 0?var41:var44 / (float)var36[var43];
                  var16 = (float)var29[var43] * var50;
                  float var51 = (float)var31[var43] * var50;
                  var52 = (float)var37[var43] * var50;
                  var49.putFloat(var16);
                  var49.putFloat(var51);
                  var49.putFloat(var52);
               }

               nda.a(-18243, var6, var49.position(), 0, ((long[])((long[])this.R[50]))[0]);
            }

            this.f_gb.d = var6;
            this.f_gb.b = true;
         }

         if(var4) {
            if(this.K.c == null) {
               this.K.c = mc.a(-97, this.R, this.Bb);
            }

            var6 = this.K.c;
            lm.a(8, var6, this.s * 8, -26241);
            var7 = (Unsafe)this.R[36];
            if(var7 != null) {
               var8 = this.s * 2 * 4;
               var9 = ih.a(0, var6, var8, (byte)110);

               for(var11 = 0; var11 < this.s; ++var11) {
                  var7.putFloat(var9, this.Z[var11]);
                  var9 += 4L;
                  var7.putFloat(var9, this.Fb[var11]);
                  var9 += 4L;
               }

               oka.a(true, var6);
            } else {
               var30 = (ByteBuffer)this.R[57];
               var30.clear();

               for(var33 = 0; var33 < this.s; ++var33) {
                  var30.putFloat(this.Z[var33]);
                  var30.putFloat(this.Fb[var33]);
               }

               nda.a(-18243, var6, var30.position(), 0, ((long[])((long[])this.R[50]))[0]);
            }

            this.K.d = var6;
            this.K.b = true;
         }

         return var5;
      }
   }

   final void I(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.C; ++var3) {
            this.S[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.C; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.S[var3] = (byte)var4;
         }
      }

      this.p();
   }

   final void W(int var1) {
      this.f_rb = (short)var1;
      this.p();
   }

   final int LA() {
      if(!this.r) {
         this.h();
      }

      return this.Gb;
   }

   final void a(Object[] var1) {
      Object[] var2 = (Object[])((Object[])this.R[42]);
      aqa.a(true, var1, var2);
      int var3;
      Object[] var4;
      Object[] var5;
      if(this.E != null) {
         for(var3 = 0; var3 < this.E.length; ++var3) {
            var4 = this.E[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            ((int[])((int[])var5[1]))[12] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.Ab[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[4] * (float)this.V[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[5] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.Ab[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[5] * (float)this.V[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[4] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.Ab[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[6] * (float)this.V[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.Ab[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[4] * (float)this.V[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[9] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.Ab[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[5] * (float)this.V[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[7] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.Ab[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[6] * (float)this.V[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[0] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.Ab[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[4] * (float)this.V[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[8] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.Ab[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[5] * (float)this.V[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[11] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.Ab[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[6] * (float)this.V[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
         }
      }

      if(this.xb != null) {
         for(var3 = 0; var3 < this.xb.length; ++var3) {
            var4 = this.xb[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            if(var4[0] != null) {
               sea.a(var2, (Object[])((Object[])var4[0]), (byte)83);
            } else {
               var4[0] = ona.a(new Object[2], var2, (byte)125);
            }

            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.Ab[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[4] * (float)this.V[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[1] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.Ab[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[5] * (float)this.V[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[3] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.Ab[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[6] * (float)this.V[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
         }
      }

   }

   final void f() {
      if(this.s > 0 && this.yb > 0) {
         this.i();
         this.k();
         this.g();
      }
   }

   private static final short[] a(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final boolean a(int var1, int var2, Object[] var3, boolean var4, int var5) {
      Object[] var6 = (Object[])((Object[])this.R[42]);
      aqa.a(true, var3, var6);
      vta.a((Object[])((Object[])this.R[16]), var6, 118);
      boolean var7 = false;
      float var15 = Float.MAX_VALUE;
      float var16 = -3.4028235E38F;
      float var17 = Float.MAX_VALUE;
      float var18 = -3.4028235E38F;
      if(!this.r) {
         this.h();
      }

      int var19 = this.U - this.Gb >> 1;
      int var20 = this.q - this.f_tb >> 1;
      int var21 = this.f_kb - this.D >> 1;
      int var22 = this.Gb + var19;
      int var23 = this.f_tb + var20;
      int var24 = this.D + var21;
      int var25 = var22 - (var19 << var5);
      int var26 = var23 - (var20 << var5);
      int var27 = var24 - (var21 << var5);
      int var28 = var22 + (var19 << var5);
      int var29 = var23 + (var20 << var5);
      int var30 = var24 + (var21 << var5);
      Db[0] = var25;
      f_mb[0] = var26;
      y[0] = var27;
      Db[1] = var28;
      f_mb[1] = var26;
      y[1] = var27;
      Db[2] = var25;
      f_mb[2] = var29;
      y[2] = var27;
      Db[3] = var28;
      f_mb[3] = var29;
      y[3] = var27;
      Db[4] = var25;
      f_mb[4] = var26;
      y[4] = var30;
      Db[5] = var28;
      f_mb[5] = var26;
      y[5] = var30;
      Db[6] = var25;
      f_mb[6] = var29;
      y[6] = var30;
      Db[7] = var28;
      f_mb[7] = var29;
      y[7] = var30;

      float var8;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      int var31;
      for(var31 = 0; var31 < 8; ++var31) {
         var12 = (float)Db[var31];
         var13 = (float)f_mb[var31];
         var14 = (float)y[var31];
         var10 = ((float[])((float[])var6[0]))[2] * var12 + ((float[])((float[])var6[0]))[6] * var13 + ((float[])((float[])var6[0]))[10] * var14 + ((float[])((float[])var6[0]))[14];
         var11 = ((float[])((float[])var6[0]))[3] * var12 + ((float[])((float[])var6[0]))[7] * var13 + ((float[])((float[])var6[0]))[11] * var14 + ((float[])((float[])var6[0]))[15];
         if(var10 >= -var11) {
            var8 = ((float[])((float[])var6[0]))[0] * var12 + ((float[])((float[])var6[0]))[4] * var13 + ((float[])((float[])var6[0]))[8] * var14 + ((float[])((float[])var6[0]))[12];
            var9 = ((float[])((float[])var6[0]))[1] * var12 + ((float[])((float[])var6[0]))[5] * var13 + ((float[])((float[])var6[0]))[9] * var14 + ((float[])((float[])var6[0]))[13];
            float var32 = ((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var8 / var11;
            float var33 = ((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var9 / var11;
            if(var32 < var15) {
               var15 = var32;
            }

            if(var32 > var16) {
               var16 = var32;
            }

            if(var33 < var17) {
               var17 = var33;
            }

            if(var33 > var18) {
               var18 = var33;
            }

            var7 = true;
         }
      }

      if(var7 && (float)var1 > var15 && (float)var1 < var16 && (float)var2 > var17 && (float)var2 < var18) {
         if(var4) {
            return true;
         }

         if(J.length < this.s) {
            J = new int[this.s];
            f_db = new int[this.s];
         }

         for(var31 = 0; var31 < this.f_ub; ++var31) {
            var12 = (float)this.Ab[var31];
            var13 = (float)this.V[var31];
            var14 = (float)this.f_jb[var31];
            var10 = ((float[])((float[])var6[0]))[2] * var12 + ((float[])((float[])var6[0]))[6] * var13 + ((float[])((float[])var6[0]))[10] * var14 + ((float[])((float[])var6[0]))[14];
            var11 = ((float[])((float[])var6[0]))[3] * var12 + ((float[])((float[])var6[0]))[7] * var13 + ((float[])((float[])var6[0]))[11] * var14 + ((float[])((float[])var6[0]))[15];
            int var34;
            int var35;
            int var36;
            int var37;
            if(var10 >= -var11) {
               var8 = ((float[])((float[])var6[0]))[0] * var12 + ((float[])((float[])var6[0]))[4] * var13 + ((float[])((float[])var6[0]))[8] * var14 + ((float[])((float[])var6[0]))[12];
               var9 = ((float[])((float[])var6[0]))[1] * var12 + ((float[])((float[])var6[0]))[5] * var13 + ((float[])((float[])var6[0]))[9] * var14 + ((float[])((float[])var6[0]))[13];
               var37 = this.P[var31];
               var36 = this.P[var31 + 1];

               for(var34 = var37; var34 < var36; ++var34) {
                  var35 = this.A[var34] - 1;
                  if(var35 == -1) {
                     break;
                  }

                  J[var35] = (int)(((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var8 / var11);
                  f_db[var35] = (int)(((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var9 / var11);
               }
            } else {
               var37 = this.P[var31];
               var36 = this.P[var31 + 1];

               for(var34 = var37; var34 < var36; ++var34) {
                  var35 = this.A[var34] - 1;
                  if(var35 == -1) {
                     break;
                  }

                  J[this.A[var34] - 1] = -999999;
               }
            }
         }

         for(var31 = 0; var31 < this.C; ++var31) {
            if(J[this.x[var31]] != -999999 && J[this.f_lb[var31]] != -999999 && J[this.f_nb[var31]] != -999999 && this.a(var1, var2, f_db[this.x[var31]], f_db[this.f_lb[var31]], f_db[this.f_nb[var31]], J[this.x[var31]], J[this.f_lb[var31]], J[this.f_nb[var31]])) {
               return true;
            }
         }
      }

      return false;
   }

   private final void d(Object[] var1) {
      if(this.Eb != null) {
         av.a(!this.Y, this.R, 0);
         Object[] var2 = (Object[])((Object[])this.R[6]);
         Object[] var3 = (Object[])((Object[])this.R[40]);

         for(int var4 = 0; var4 < this.Ib; ++var4) {
            Object[] var5 = this.Eb[var4];
            Object[] var6 = this.f_bb[var4];
            if(!((boolean[])((boolean[])var5[0]))[0] || !gka.a((byte)123, this.R)) {
               float var7 = (float)(this.Ab[((int[])((int[])var5[1]))[2]] + this.Ab[((int[])((int[])var5[1]))[3]] + this.Ab[((int[])((int[])var5[1]))[4]]) * 0.3333333F;
               float var8 = (float)(this.V[((int[])((int[])var5[1]))[2]] + this.V[((int[])((int[])var5[1]))[3]] + this.V[((int[])((int[])var5[1]))[4]]) * 0.3333333F;
               float var9 = (float)(this.f_jb[((int[])((int[])var5[1]))[2]] + this.f_jb[((int[])((int[])var5[1]))[3]] + this.f_jb[((int[])((int[])var5[1]))[4]]) * 0.3333333F;
               float var10 = ((float[])((float[])var1[0]))[0] * var7 + ((float[])((float[])var1[0]))[4] * var8 + ((float[])((float[])var1[0]))[8] * var9 + ((float[])((float[])var1[0]))[12];
               float var11 = ((float[])((float[])var1[0]))[1] * var7 + ((float[])((float[])var1[0]))[5] * var8 + ((float[])((float[])var1[0]))[9] * var9 + ((float[])((float[])var1[0]))[13];
               float var12 = ((float[])((float[])var1[0]))[2] * var7 + ((float[])((float[])var1[0]))[6] * var8 + ((float[])((float[])var1[0]))[10] * var9 + ((float[])((float[])var1[0]))[14];
               float var13 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12))) * (float)((int[])((int[])var5[1]))[0];
               gv.a(false, var2, var12 - var12 * var13, var10 + (float)((int[])((int[])var6[0]))[5] - var10 * var13, ((int[])((int[])var6[0]))[0] * ((short[])((short[])var5[2]))[1] >> 7, var11 + (float)((int[])((int[])var6[0]))[1] - var11 * var13, ((int[])((int[])var6[0]))[4], ((int[])((int[])var6[0]))[2] * ((short[])((short[])var5[2]))[2] >> 7);
               mv.a((byte)118, (Object[])((Object[])this.R[7]), var2);
               aqa.a(true, var2, (Object[])((Object[])this.R[15]));
               Class_k.a((Object[])((Object[])this.R[15]), var3, -88);
               Class_ds.a((Object[])((Object[])var3[0]), (byte)121);
               ((int[])((int[])var3[1]))[0] = ((int[])((int[])var6[0]))[3];
               var3[2] = oea.a((Object[])((Object[])this.R[43]), ((short[])((short[])var5[2]))[0], false);
               tna.a(1, var3);
            }
         }

         av.a(true, this.R, 0);
      }
   }

   final int BA() {
      return this.f_rb;
   }

   final int MA() {
      if(!this.r) {
         this.h();
      }

      return this.zb;
   }

   final void a(Object[] var1, lpa var2, int var3) {
      if(f_hb != null) {
         f_hb.a();
      }

      if(this.s != 0) {
         Object[] var4 = (Object[])((Object[])this.R[33]);
         Object[] var5 = (Object[])((Object[])this.R[42]);
         Object[] var6 = (Object[])((Object[])this.R[15]);
         aqa.a(true, var1, var5);
         sea.a(var5, var6, (byte)65);
         vta.a((Object[])((Object[])this.R[16]), var6, 67);
         if(!this.r) {
            this.h();
         }

         float[] var7 = (float[])((float[])this.R[2]);
         jn.a(0.0F, (float)this.f_tb, var7, var5, true, 0.0F);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         jn.a(0.0F, (float)this.q, var7, var5, true, 0.0F);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var17;
         float var16;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = ((float[][])((float[][])this.R[14]))[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.zb;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.zb;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var21 = false;
            boolean var22 = true;
            int var23 = this.Gb + this.U >> 1;
            int var24 = this.D + this.f_kb >> 1;
            int var19 = this.f_tb;
            float var34 = ((float[])((float[])var6[0]))[0] * (float)var23 + ((float[])((float[])var6[0]))[4] * (float)var19 + ((float[])((float[])var6[0]))[8] * (float)var24 + ((float[])((float[])var6[0]))[12];
            float var33 = ((float[])((float[])var6[0]))[1] * (float)var23 + ((float[])((float[])var6[0]))[5] * (float)var19 + ((float[])((float[])var6[0]))[9] * (float)var24 + ((float[])((float[])var6[0]))[13];
            var16 = ((float[])((float[])var6[0]))[2] * (float)var23 + ((float[])((float[])var6[0]))[6] * (float)var19 + ((float[])((float[])var6[0]))[10] * (float)var24 + ((float[])((float[])var6[0]))[14];
            var17 = ((float[])((float[])var6[0]))[3] * (float)var23 + ((float[])((float[])var6[0]))[7] * (float)var19 + ((float[])((float[])var6[0]))[11] * (float)var24 + ((float[])((float[])var6[0]))[15];
            if(var16 >= -var17) {
               var2.f_i = (int)(((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var34 / var17);
               var2.f_l = (int)(((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var33 / var17);
            } else {
               var21 = true;
            }

            var19 = this.q;
            float var25 = ((float[])((float[])var6[0]))[0] * (float)var23 + ((float[])((float[])var6[0]))[4] * (float)var19 + ((float[])((float[])var6[0]))[8] * (float)var24 + ((float[])((float[])var6[0]))[12];
            float var26 = ((float[])((float[])var6[0]))[1] * (float)var23 + ((float[])((float[])var6[0]))[5] * (float)var19 + ((float[])((float[])var6[0]))[9] * (float)var24 + ((float[])((float[])var6[0]))[13];
            float var27 = ((float[])((float[])var6[0]))[2] * (float)var23 + ((float[])((float[])var6[0]))[6] * (float)var19 + ((float[])((float[])var6[0]))[10] * (float)var24 + ((float[])((float[])var6[0]))[14];
            float var28 = ((float[])((float[])var6[0]))[3] * (float)var23 + ((float[])((float[])var6[0]))[7] * (float)var19 + ((float[])((float[])var6[0]))[11] * (float)var24 + ((float[])((float[])var6[0]))[15];
            if(var27 >= -var28) {
               var2.n = (int)(((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var25 / var28);
               var2.m = (int)(((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var26 / var28);
            } else {
               var21 = true;
            }

            float var29;
            float var30;
            if(var21) {
               if(var16 < -var17 && var27 < -var28) {
                  var22 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var34 + var29 * (var25 - var34);
                     var31 = var33 + var29 * (var26 - var33);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.f_i = (int)(((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var30 / var32);
                     var2.f_l = (int)(((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var34 - var25);
                     var31 = var26 + var29 * (var33 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.n = (int)(((float[])((float[])this.R[0]))[4] + ((float[])((float[])this.R[0]))[9] * var30 / var32);
                     var2.m = (int)(((float[])((float[])this.R[0]))[15] + ((float[])((float[])this.R[0]))[10] * var31 / var32);
                  }
               }
            }

            if(var22) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var34 + ((float[])((float[])var4[0]))[0] * (float)this.zb + ((float[])((float[])var4[0]))[12];
                  var30 = var17 + ((float[])((float[])var4[0]))[3] * (float)this.zb + ((float[])((float[])var4[0]))[15];
                  var2.j = (int)(((float[])((float[])this.R[0]))[4] - (float)var2.f_i + ((float[])((float[])this.R[0]))[9] * var29 / var30);
               } else {
                  var29 = var25 + ((float[])((float[])var4[0]))[0] * (float)this.zb + ((float[])((float[])var4[0]))[12];
                  var30 = var28 + ((float[])((float[])var4[0]))[3] * (float)this.zb + ((float[])((float[])var4[0]))[15];
                  var2.j = (int)(((float[])((float[])this.R[0]))[4] - (float)var2.n + ((float[])((float[])this.R[0]))[9] * var29 / var30);
               }

               var2.k = true;
            }
         }

         nia.a(var3, this.R, -92);
         this.c(var1);
         nia.a(0, this.R, -92);
         aqa.a(true, var1, var5);
         vta.a((Object[])((Object[])this.R[28]), var5, 87);
         this.d(var5);
      }
   }

   final void q(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.C; ++var3) {
         if(this.f_pb[var3] == var1) {
            this.f_pb[var3] = var2;
         }
      }

      if(this.Eb != null) {
         for(var3 = 0; var3 < this.Ib; ++var3) {
            Object[] var4 = this.Eb[var3];
            Object[] var5 = this.f_bb[var3];
            ((int[])((int[])var5[0]))[3] = ((int[])((int[])var5[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var4[1]))[1]] & '\uffff'] & 16777215;
         }
      }

      this.p();
   }

   final void TA() {
      for(int var1 = 0; var1 < this.p; ++var1) {
         this.Ab[var1] = this.Ab[var1] + 7 >> 4;
         this.V[var1] = this.V[var1] + 7 >> 4;
         this.f_jb[var1] = this.f_jb[var1] + 7 >> 4;
      }

      this.j();
      this.r = false;
   }

   final int RA() {
      if(!this.r) {
         this.h();
      }

      return this.U;
   }

   final ka a(byte var1, int var2, boolean var3) {
      boolean var6 = false;
      hu var4;
      hu var5;
      if(var1 > 0 && var1 <= 7) {
         var5 = ((hu[])((hu[])this.R[44]))[var1 - 1];
         var4 = ((hu[])((hu[])this.R[11]))[var1 - 1];
         var6 = true;
      } else {
         var4 = var5 = new hu(this.R, 0, 0, true, false);
      }

      return this.a(var4, var5, var2, var6, var3);
   }

   final int D() {
      if(!this.r) {
         this.h();
      }

      return this.f_kb;
   }

   private final void b(Object[] var1) {
      if(J.length < this.s) {
         J = new int[this.s];
         f_db = new int[this.s];
      }

      int var2 = 0;

      int var6;
      int var7;
      int var8;
      while(var2 < this.f_ub) {
         int var3 = (this.Ab[var2] - (this.V[var2] * ((int[])((int[])this.R[1]))[27] >> 8) >> ((int[])((int[])this.R[1]))[5]) - ((int[])((int[])var1[1]))[3];
         int var4 = (this.f_jb[var2] - (this.V[var2] * ((int[])((int[])this.R[1]))[6] >> 8) >> ((int[])((int[])this.R[1]))[5]) - ((int[])((int[])var1[1]))[2];
         int var5 = this.P[var2];
         var6 = this.P[var2 + 1];
         var7 = var5;

         while(true) {
            if(var7 < var6) {
               var8 = this.A[var7] - 1;
               if(var8 != -1) {
                  J[var8] = var3;
                  f_db[var8] = var4;
                  ++var7;
                  continue;
               }
            }

            ++var2;
            break;
         }
      }

      for(var2 = 0; var2 < this.yb; ++var2) {
         if(this.S == null || this.S[var2] <= 128) {
            short var12 = this.x[var2];
            short var13 = this.f_lb[var2];
            short var14 = this.f_nb[var2];
            var6 = J[var12];
            var7 = J[var13];
            var8 = J[var14];
            int var9 = f_db[var12];
            int var10 = f_db[var13];
            int var11 = f_db[var14];
            if((var6 - var7) * (var10 - var11) - (var10 - var9) * (var8 - var7) > 0) {
               wta.a(var9, var1, (byte)77, var8, var10, var7, var11, var6);
            }
         }
      }

   }

   final ya p(ya var1) {
      if(this.s == 0) {
         return null;
      } else {
         if(!this.r) {
            this.h();
         }

         int var4;
         int var5;
         if(((int[])((int[])this.R[1]))[27] > 0) {
            var4 = this.Gb - (this.q * ((int[])((int[])this.R[1]))[27] >> 8) >> ((int[])((int[])this.R[1]))[5];
            var5 = this.U - (this.f_tb * ((int[])((int[])this.R[1]))[27] >> 8) >> ((int[])((int[])this.R[1]))[5];
         } else {
            var4 = this.Gb - (this.f_tb * ((int[])((int[])this.R[1]))[27] >> 8) >> ((int[])((int[])this.R[1]))[5];
            var5 = this.U - (this.q * ((int[])((int[])this.R[1]))[27] >> 8) >> ((int[])((int[])this.R[1]))[5];
         }

         int var6;
         int var7;
         if(((int[])((int[])this.R[1]))[6] > 0) {
            var6 = this.D - (this.q * ((int[])((int[])this.R[1]))[6] >> 8) >> ((int[])((int[])this.R[1]))[5];
            var7 = this.f_kb - (this.f_tb * ((int[])((int[])this.R[1]))[6] >> 8) >> ((int[])((int[])this.R[1]))[5];
         } else {
            var6 = this.D - (this.f_tb * ((int[])((int[])this.R[1]))[6] >> 8) >> ((int[])((int[])this.R[1]))[5];
            var7 = this.f_kb - (this.q * ((int[])((int[])this.R[1]))[6] >> 8) >> ((int[])((int[])this.R[1]))[5];
         }

         Object[] var10;
         label53: {
            int var8 = var5 - var4 + 1;
            int var9 = var7 - var6 + 1;
            bca var2;
            Object[] var11 = (var2 = (bca)var1) == null?null:var2.I;
            if(var11 != null) {
               boolean var12 = ~((byte[])((byte[])var11[2])).length <= ~(var9 * var8);
               if(var12) {
                  var10 = var11;
                  dia.a((byte)58, var11);
                  break label53;
               }
            }

            Object[] var13 = new Object[3];
            if(var13[1] == null) {
               var13[1] = new int[4];
            }

            var13[0] = ui.a((int)126, var13);
            var13[2] = new byte[var8 * var9];
            var10 = var13;
         }

         sm.a(var10, var5, var7, 6779, var4, var6);
         this.b(var10);
         return (ya)(var10 == null?null:var10[0]);
      }
   }

   private final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   final void n() {
      if(this.Q != null) {
         this.Q.a();
      }

      if(this.K != null) {
         this.K.a();
      }

      if(this.w != null) {
         this.w.a();
      }

      if(this.f_gb != null) {
         this.f_gb.a();
      }

      if(this.T != null) {
         this.T.b();
      }

   }

   final void UA(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_ub; ++var4) {
         int var5 = this.V[var4] * var3 - this.f_jb[var4] * var2 >> 14;
         this.f_jb[var4] = this.V[var4] * var2 + this.f_jb[var4] * var3 >> 14;
         this.V[var4] = var5;
      }

      this.j();
      this.r = false;
   }

   final void c() {}

   final void a(ka var1, int var2, int var3, int var4, boolean var5) {
      hu var6 = (hu)var1;
      if(this.C != 0 && var6.C != 0) {
         int var7 = var6.f_ub;
         int[] var8 = var6.Ab;
         int[] var9 = var6.V;
         int[] var10 = var6.f_jb;
         short[] var11 = var6.Jb;
         short[] var12 = var6.f_eb;
         short[] var13 = var6.f_ib;
         byte[] var14 = var6.B;
         short[] var15;
         short[] var17;
         short[] var16;
         byte[] var18;
         if(this.f_fb != null) {
            var15 = this.f_fb.b;
            var16 = this.f_fb.c;
            var17 = this.f_fb.a;
            var18 = this.f_fb.d;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var21;
         short[] var20;
         byte[] var22;
         if(var6.f_fb != null) {
            var19 = var6.f_fb.b;
            var20 = var6.f_fb.c;
            var21 = var6.f_fb.a;
            var22 = var6.f_fb.d;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.P;
         short[] var24 = var6.A;
         if(!var6.r) {
            var6.h();
         }

         int var25 = var6.f_tb;
         int var26 = var6.q;
         int var27 = var6.Gb;
         int var28 = var6.U;
         int var29 = var6.D;
         int var30 = var6.f_kb;

         for(int var31 = 0; var31 < this.f_ub; ++var31) {
            int var32 = this.V[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.Ab[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.f_jb[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.P[var31];
                     int var37 = this.P[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.A[var38] - 1;
                        if(var35 == -1 || this.B[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37; ++var40) {
                                 var39 = var24[var40] - 1;
                                 if(var39 == -1 || var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.f_fb = new lda();
                                    var15 = this.f_fb.b = rg.a(this.Jb, 61);
                                    var16 = this.f_fb.c = rg.a(this.f_eb, 102);
                                    var17 = this.f_fb.a = rg.a(this.f_ib, -124);
                                    var18 = this.f_fb.d = nm.a(false, this.B);
                                 }

                                 if(var19 == null) {
                                    lda var47 = var6.f_fb = new lda();
                                    var19 = var47.b = rg.a(var11, -90);
                                    var20 = var47.c = rg.a(var12, 67);
                                    var21 = var47.a = rg.a(var13, 76);
                                    var22 = var47.d = nm.a(false, var14);
                                 }

                                 short var46 = this.Jb[var35];
                                 short var41 = this.f_eb[var35];
                                 short var42 = this.f_ib[var35];
                                 byte var43 = this.B[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var46;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var46 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.P[var31];
                                 var37 = this.P[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.A[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var18[var45] != 0) {
                                       var15[var45] += var46;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.l();
                                 this.l();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private final int a(int var1, short var2, int var3) {
      int var5 = ((int[])((int[])this.R[73]))[this.a(var1, var3)];
      if(var2 != -1) {
         Object[] var4 = this.R;
         Object[] var6 = ((ta)(this.R == null?null:var4[38])).k.a(var2 & '\uffff', (byte)97);
         int var7 = ((byte[])((byte[])var6[0]))[3] & 255;
         int var8;
         int var10;
         if(var7 != 0) {
            var8 = 131586 * var3;
            if(var7 == 256) {
               var5 = var8;
            } else {
               var10 = 256 - var7;
               var5 = ((var8 & 16711935) * var7 + (var5 & 16711935) * var10 & -16711936) + ((var8 & '\uff00') * var7 + (var5 & '\uff00') * var10 & 16711680) >> 8;
            }
         }

         var8 = ((byte[])((byte[])var6[0]))[1] & 255;
         if(var8 != 0) {
            var8 += 256;
            int var9 = ((var5 & 16711680) >> 16) * var8;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            var10 = ((var5 & '\uff00') >> 8) * var8;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            int var11 = (var5 & 255) * var8;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            var5 = (var9 << 8 & 16711680) + (var10 & '\uff00') + (var11 >> 8);
         }
      }

      return var5 & 16777215;
   }

   private final void c(Object[] var1) {
      if(this.yb != 0) {
         if(this.i() && this.k()) {
            if(f_hb != null) {
               ;
            }

            bq.a(12391, this.R);
            Object[] var5 = (Object[])((Object[])this.R[58]);
            hca.a(0, this.Q.d, this.R, 0);
            hca.a(1, this.w.d, this.R, 0);
            hca.a(2, this.K.d, this.R, 0);
            eca.a(this.R, 24394, this.T.a);
            aqa.a(true, var1, (Object[])((Object[])this.R[42]));
            qba.a((Object[])((Object[])this.R[42]), (byte)-15, var5);
            Class_ds.a((Object[])((Object[])var5[9]), (byte)104);
            Object[] var6;
            if(((boolean[])((boolean[])this.R[63]))[11]) {
               var6 = iv.a(this.R, 127);
               aha.a(1.0F, (float)((int[])((int[])this.R[1]))[35] + (float)((int[])((int[])var6[0]))[0] / 255.0F * (float)((int[])((int[])var6[0]))[5], 0.0F, 0.0F, (Object[])((Object[])var5[10]), (byte)-74);
               rk.a((Object[])((Object[])var5[10]), 1.0F / (float)((int[])((int[])var6[0]))[5], (byte)38);
               Class_cs.a((float)(((int[])((int[])var6[0]))[1] >> 0 & 255) / 255.0F, (float)(((int[])((int[])var6[0]))[1] >> 16 & 255) / 255.0F, (float)(((int[])((int[])var6[0]))[1] >> 8 & 255) / 255.0F, (Object[])((Object[])var5[15]), (byte)125);
            } else {
               aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var5[10]), (byte)-74);
               Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var5[15]), (byte)125);
            }

            if(((int[])((int[])this.R[1]))[4] > 0) {
               aha.a(0.0F, -((float[])((float[])this.R[0]))[13], 0.0F, 1.0F, (Object[])((Object[])var5[12]), (byte)-74);
               Class_cs.a((float)(((int[])((int[])this.R[1]))[15] >> 0 & 255) / 255.0F, (float)(((int[])((int[])this.R[1]))[15] >> 16 & 255) / 255.0F, (float)(((int[])((int[])this.R[1]))[15] >> 8 & 255) / 255.0F, (Object[])((Object[])var5[3]), (byte)125);
               aqa.a(true, var1, (Object[])((Object[])this.R[42]));
               qp.a((int)4, (Object[])((Object[])this.R[42]));
               psa.a(true, (Object[])((Object[])var5[10]), (Object[])((Object[])this.R[42]));
               aqa.a(true, var1, (Object[])((Object[])this.R[42]));
               vta.a((Object[])((Object[])this.R[28]), (Object[])((Object[])this.R[42]), 65);
               qp.a((int)4, (Object[])((Object[])this.R[42]));
               psa.a(true, (Object[])((Object[])var5[12]), (Object[])((Object[])this.R[42]));
               rk.a((Object[])((Object[])var5[12]), 1.0F / (((float[])((float[])this.R[0]))[16] - ((float[])((float[])this.R[0]))[13]), (byte)87);
            } else {
               aha.a(0.0F, 0.0F, 0.0F, 0.0F, (Object[])((Object[])var5[12]), (byte)-74);
               Class_cs.a(0.0F, 0.0F, 0.0F, (Object[])((Object[])var5[3]), (byte)125);
            }

            int var7;
            int var8;
            int var9;
            if((this.F & 55) == 0) {
               ws.a(94, (Object[])((Object[])this.R[21]), this.R);
               if(((boolean[])((boolean[])this.R[63]))[16]) {
                  jea.a(this.R, (byte)93, false);
               }

               for(int var19 = 0; var19 < this.H.length; ++var19) {
                  var7 = this.Cb[var19];
                  var8 = this.Cb[var19 + 1];
                  var9 = this.O[var7] & '\uffff';
                  boolean var10 = false;
                  if(var9 != '\uffff') {
                     var5[6] = oea.a((Object[])((Object[])this.R[43]), var9, false);
                     Object[] var2 = this.R;
                     Object[] var11 = ((ta)(this.R == null?null:var2[38])).k.a(var9, (byte)39);
                     byte var13 = ((byte[])((byte[])var11[0]))[4];
                     boolean var12 = var13 != 1 && 7 != var13;
                     var10 = !var12;
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[12] = (float)(((int[])((int[])this.R[1]))[28] % 128000) / 1000.0F * (float)((byte[])((byte[])var11[0]))[5] / 64.0F % 1.0F;
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[13] = (float)(((int[])((int[])this.R[1]))[28] % 128000) / 1000.0F * (float)((byte[])((byte[])var11[0]))[6] / 64.0F % 1.0F;
                  } else {
                     var5[6] = this.R[37];
                     float[] var22 = (float[])((float[])((Object[])((Object[])var5[9]))[0]);
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[13] = 0.0F;
                     var22[12] = 0.0F;
                  }

                  ((int[])((int[])var5[1]))[1] = this.H[var19];
                  ((int[])((int[])var5[1]))[2] = this.f_sb[var19];
                  ((int[])((int[])var5[1]))[0] = var7 * 3;
                  ((int[])((int[])var5[1]))[3] = var8 - var7;
                  dsa.a(var10, var5, (byte)-61);
               }
            } else {
               hca.a(3, this.f_gb.d, this.R, 0);
               ws.a(104, (Object[])((Object[])this.R[54]), this.R);
               var6 = (Object[])((Object[])this.R[6]);
               lg.a(var6, var1, -18072);
               kj.a(true, var6);
               var7 = 0;
               int var26;
               if(((boolean[])((boolean[])this.R[63]))[16]) {
                  jea.a(this.R, (byte)93, true);
               } else {
                  Class_cs.a(((float[])((float[])this.R[53]))[2], ((float[])((float[])this.R[53]))[0], ((float[])((float[])this.R[53]))[1], (Object[])((Object[])var5[16]), (byte)125);
                  bka.a((Object[])((Object[])var5[16]), (byte)127, var6);
                  Class_cs.a(((float[])((float[])this.R[0]))[8] * ((float[])((float[])this.R[0]))[3], ((float[])((float[])this.R[0]))[8] * ((float[])((float[])this.R[0]))[11], ((float[])((float[])this.R[0]))[8] * ((float[])((float[])this.R[0]))[2], (Object[])((Object[])var5[11]), (byte)125);
                  Class_cs.a(-((float[])((float[])this.R[0]))[0] * ((float[])((float[])this.R[0]))[3], -((float[])((float[])this.R[0]))[0] * ((float[])((float[])this.R[0]))[11], -((float[])((float[])this.R[0]))[0] * ((float[])((float[])this.R[0]))[2], (Object[])((Object[])var5[13]), (byte)125);
                  Class_cs.a(((float[])((float[])this.R[0]))[17] * ((float[])((float[])this.R[0]))[3], ((float[])((float[])this.R[0]))[17] * ((float[])((float[])this.R[0]))[11], ((float[])((float[])this.R[0]))[17] * ((float[])((float[])this.R[0]))[2], (Object[])((Object[])var5[14]), (byte)125);
                  if(((int[])((int[])this.R[1]))[24] > 0) {
                     var7 = ((int[])((int[])this.R[1]))[24];
                     Object[] var20 = (Object[])((Object[])this.R[34]);

                     for(var9 = 0; var9 < var7; ++var9) {
                        Object[] var21 = ((Object[][])((Object[][])this.R[30]))[var9];
                        var26 = gaa.a(var21, (byte)-69);
                        rna.a((Object[])((Object[])var21[2]), var20, true);
                        ae.a(-10554, var20, var6);
                        ((float[])((float[])var5[5]))[var9 * 4 + 0] = ((float[])((float[])var20[1]))[2];
                        ((float[])((float[])var5[5]))[var9 * 4 + 1] = ((float[])((float[])var20[1]))[0];
                        ((float[])((float[])var5[5]))[var9 * 4 + 2] = ((float[])((float[])var20[1]))[1];
                        ((float[])((float[])var5[5]))[var9 * 4 + 3] = (float)(mc.a(false, var21) * mc.a(false, var21));
                        float var24 = sba.a(0, var21) / 255.0F;
                        ((float[])((float[])var5[2]))[var9 * 4 + 0] = (float)(var26 >> 16 & 255) * var24;
                        ((float[])((float[])var5[2]))[var9 * 4 + 1] = (float)(var26 >> 8 & 255) * var24;
                        ((float[])((float[])var5[2]))[var9 * 4 + 2] = (float)(var26 & 255) * var24;
                        ((float[])((float[])var5[2]))[var9 * 4 + 3] = 1.0F;
                     }
                  }
               }

               for(var8 = 0; var8 < this.H.length; ++var8) {
                  var9 = this.Cb[var8];
                  int var23 = this.Cb[var8 + 1];
                  var26 = this.O[var9] & '\uffff';
                  byte var25 = 11;
                  if(var26 != '\uffff') {
                     var5[6] = oea.a((Object[])((Object[])this.R[43]), var26, false);
                     Object[] var3 = this.R;
                     Object[] var28 = ((ta)(this.R == null?null:var3[38])).k.a(var26, (byte)60);
                     var25 = ((byte[])((byte[])var28[0]))[4];
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[12] = (float)(((int[])((int[])this.R[1]))[28] % 128000) / 1000.0F * (float)((byte[])((byte[])var28[0]))[5] / 64.0F % 1.0F;
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[13] = (float)(((int[])((int[])this.R[1]))[28] % 128000) / 1000.0F * (float)((byte[])((byte[])var28[0]))[6] / 64.0F % 1.0F;
                  } else {
                     var5[6] = this.R[37];
                     float[] var27 = (float[])((float[])((Object[])((Object[])var5[9]))[0]);
                     ((float[])((float[])((Object[])((Object[])var5[9]))[0]))[13] = 0.0F;
                     var27[12] = 0.0F;
                  }

                  ((int[])((int[])var5[1]))[1] = this.H[var8];
                  ((int[])((int[])var5[1]))[2] = this.f_sb[var8];
                  ((int[])((int[])var5[1]))[0] = var9 * 3;
                  ((int[])((int[])var5[1]))[3] = var23 - var9;
                  Object[] var17;
                  Object[] var16;
                  if(var25 == 7) {
                     Class_cs.a(((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[14], ((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[12], ((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[13], (Object[])((Object[])var5[4]), (byte)125);
                     ae.a(-10554, (Object[])((Object[])var5[4]), var6);
                     aqa.a(true, var1, (Object[])((Object[])var5[0]));
                     Object[] var15 = this.R;
                     if(var15[25] != null) {
                        Object[] var18 = (Object[])((Object[])var15[25]);
                        if(var18 == null) {
                           throw new IllegalStateException();
                        }

                        var17 = uf.a(true, var18);
                        var16 = var17;
                     } else {
                        var16 = null;
                     }

                     var5[7] = var16;
                     if(var5 != null && var5.length == 39) {
                        as.a(var7, -123, var5);
                     } else {
                        if(null == var5 || -18 != ~var5.length) {
                           throw new IllegalStateException();
                        }

                        eia.a(121, var5, var7);
                     }
                  } else if(var25 == 1) {
                     Class_cs.a(((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[14], ((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[12], ((float[])((float[])((Object[])((Object[])this.R[3]))[0]))[13], (Object[])((Object[])var5[4]), (byte)125);
                     ae.a(-10554, (Object[])((Object[])var5[4]), var6);
                     if(null != var5 && var5.length == 39) {
                        te.a(var5, false, var7);
                     } else {
                        if(null == var5 || 17 != var5.length) {
                           throw new IllegalStateException();
                        }

                        wr.a(var5, var7, 0);
                     }
                  } else if(var25 == 5) {
                     if(!((boolean[])((boolean[])this.R[63]))[16]) {
                        var16 = (Object[])((Object[])this.R[55]);
                        Object[] var4 = this.R;
                        var17 = ((ta)(this.R == null?null:var4[38])).k.a(var26, (byte)36);
                        fk.a(((int[])((int[])var17[1]))[2], 64, var16, ((byte[])((byte[])var17[0]))[0]);
                        aqa.a(true, var1, (Object[])((Object[])var16[28]));
                        vta.a((Object[])((Object[])this.R[51]), (Object[])((Object[])var16[28]), 84);
                        ((int[])((int[])var16[1]))[2] = this.H[var8];
                        ((int[])((int[])var16[1]))[1] = this.f_sb[var8];
                        ((int[])((int[])var16[1]))[4] = var9 * 3;
                        ((int[])((int[])var16[1]))[3] = var23 - var9;
                        if(!((boolean[])((boolean[])((Object[])((Object[])var16[25]))[0]))[0]) {
                           an.a((Object[])((Object[])var16[31]), (Object[])((Object[])var16[17]), true);
                        } else {
                           an.a((Object[])((Object[])var16[29]), (Object[])((Object[])var16[17]), true);
                        }

                        rsa.a(-12423, (Object[])((Object[])var16[17]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var16[25]))[0]))[0]) {
                           mn.a((Object[])((Object[])((Object[])((Object[])var16[25]))[3]), (Object[])((Object[])var16[17]), (byte)74, 0, (Object[])((Object[])var16[24]));
                        }

                        vla.a((Object[])((Object[])var16[23]), true, (Object[])((Object[])var16[27]), (Object[])((Object[])var16[17]));
                        vla.a((Object[])((Object[])var16[26]), true, (Object[])((Object[])var16[28]), (Object[])((Object[])var16[17]));
                        vm.a(kja.a(((float[])((float[])var16[30]))[1], ((float[])((float[])var16[30]))[3], ((float[])((float[])var16[30]))[0], new Object[2], 12, ((float[])((float[])var16[30]))[2]), (Object[])((Object[])var16[17]), 29600, (Object[])((Object[])var16[33]));
                        vm.a(kja.a(((float[])((float[])var16[34]))[1], ((float[])((float[])var16[34]))[3], ((float[])((float[])var16[34]))[0], new Object[2], 12, ((float[])((float[])var16[34]))[2]), (Object[])((Object[])var16[17]), 29600, (Object[])((Object[])var16[22]));
                        vm.a(kja.a(0.0F, 0.0F, ((float[])((float[])var16[32]))[0], new Object[2], 12, 0.0F), (Object[])((Object[])var16[17]), 29600, (Object[])((Object[])var16[35]));
                        vw.a(vqa.j, (Object[])((Object[])var16[0]), ((int[])((int[])var16[1]))[1], ((int[])((int[])var16[1]))[4], ((int[])((int[])var16[1]))[2], (byte)-128, ((int[])((int[])var16[1]))[3]);
                     } else {
                        ps.b(var5, var7, (byte)122);
                     }
                  } else {
                     ps.b(var5, var7, (byte)98);
                  }
               }
            }

            this.g();
         }
      }
   }

   private final ka a(hu var1, hu var2, int var3, boolean var4, boolean var5) {
      var1.W = var3;
      var1.F = this.F;
      var1.f_rb = this.f_rb;
      var1.z = this.z;
      var1.p = this.p;
      var1.f_ub = this.f_ub;
      var1.s = this.s;
      var1.C = this.C;
      var1.yb = this.yb;
      var1.Ib = this.Ib;
      if((var3 & 256) != 0) {
         var1.Y = true;
      } else {
         var1.Y = this.Y;
      }

      var1.t = this.t;
      boolean var6 = 0 != (33 & var3);
      boolean var7 = var6;
      boolean var8 = -1 != ~(34 & var3);
      boolean var9 = var8;
      boolean var10 = 0 != (var3 & 52);
      boolean var11 = var10;
      boolean var12 = var6 | var8 | var10;
      int var13;
      if(var12) {
         if(var6) {
            if(var2.Ab != null && var2.Ab.length >= this.p) {
               var1.Ab = var2.Ab;
            } else {
               var1.Ab = var2.Ab = new int[this.p];
            }
         } else {
            var1.Ab = this.Ab;
         }

         if(var8) {
            if(var2.V != null && var2.V.length >= this.p) {
               var1.V = var2.V;
            } else {
               var1.V = var2.V = new int[this.p];
            }
         } else {
            var1.V = this.V;
         }

         if(var10) {
            if(var2.f_jb != null && var2.f_jb.length >= this.p) {
               var1.f_jb = var2.f_jb;
            } else {
               var1.f_jb = var2.f_jb = new int[this.p];
            }
         } else {
            var1.f_jb = this.f_jb;
         }

         for(var13 = 0; var13 < this.p; ++var13) {
            if(var7) {
               var1.Ab[var13] = this.Ab[var13];
            }

            if(var9) {
               var1.V[var13] = this.V[var13];
            }

            if(var11) {
               var1.f_jb[var13] = this.f_jb[var13];
            }
         }
      } else {
         var1.Ab = this.Ab;
         var1.V = this.V;
         var1.f_jb = this.f_jb;
      }

      boolean var17;
      if(fk.a(this.F, var3, (byte)103)) {
         var1.Q = var2.Q;
         var1.Q.d = this.Q.d;
         var1.Q.b = this.Q.b;
         var1.Q.a = true;
      } else {
         var17 = 0 != (var3 & 2048);
         if(var17) {
            var1.Q = this.Q;
         } else {
            var1.Q = null;
         }
      }

      if(Class_a.a((byte)-27, this.F, var3)) {
         if(var2.f_pb != null && var2.f_pb.length >= this.C) {
            var1.f_pb = var2.f_pb;
         } else {
            var1.f_pb = var2.f_pb = new short[this.C];
         }

         for(var13 = 0; var13 < this.C; ++var13) {
            var1.f_pb[var13] = this.f_pb[var13];
         }
      } else {
         var1.f_pb = this.f_pb;
      }

      if(tqa.a(this.F, -83, var3)) {
         if(var2.S != null && var2.S.length >= this.C) {
            var1.S = var2.S;
         } else {
            var1.S = var2.S = new byte[this.C];
         }

         for(var13 = 0; var13 < this.C; ++var13) {
            var1.S[var13] = this.S[var13];
         }
      } else {
         var1.S = this.S;
      }

      if(tb.a(53, this.F, var3)) {
         var1.w = var2.w;
         var1.w.d = this.w.d;
         var1.w.b = this.w.b;
         var1.w.a = true;
      } else {
         var17 = (2048 & var3) != 0;
         if(var17) {
            var1.w = this.w;
         } else {
            var1.w = null;
         }
      }

      int var14;
      if(ns.a(var3, (byte)-13, this.F)) {
         if(var2.Jb != null && var2.Jb.length >= this.s) {
            var1.Jb = var2.Jb;
            var1.f_eb = var2.f_eb;
            var1.f_ib = var2.f_ib;
         } else {
            var13 = this.s;
            var1.Jb = var2.Jb = new short[var13];
            var1.f_eb = var2.f_eb = new short[var13];
            var1.f_ib = var2.f_ib = new short[var13];
         }

         if(this.f_fb != null) {
            if(var2.f_fb == null) {
               var2.f_fb = new lda();
            }

            lda var19 = var1.f_fb = var2.f_fb;
            if(var19.b == null || var19.b.length < this.s) {
               var14 = this.s;
               var19.b = new short[var14];
               var19.c = new short[var14];
               var19.a = new short[var14];
               var19.d = new byte[var14];
            }

            for(var14 = 0; var14 < this.s; ++var14) {
               var1.Jb[var14] = this.Jb[var14];
               var1.f_eb[var14] = this.f_eb[var14];
               var1.f_ib[var14] = this.f_ib[var14];
               var19.b[var14] = this.f_fb.b[var14];
               var19.c[var14] = this.f_fb.c[var14];
               var19.a[var14] = this.f_fb.a[var14];
               var19.d[var14] = this.f_fb.d[var14];
            }
         } else {
            var1.f_fb = null;

            for(var13 = 0; var13 < this.s; ++var13) {
               var1.Jb[var13] = this.Jb[var13];
               var1.f_eb[var13] = this.f_eb[var13];
               var1.f_ib[var13] = this.f_ib[var13];
            }
         }

         var1.B = this.B;
      } else {
         var1.f_fb = this.f_fb;
         var1.Jb = this.Jb;
         var1.f_eb = this.f_eb;
         var1.f_ib = this.f_ib;
         var1.B = this.B;
      }

      if(tha.a(var3, -23901, this.F)) {
         var1.f_gb = var2.f_gb;
         var1.f_gb.d = this.f_gb.d;
         var1.f_gb.b = this.f_gb.b;
         var1.f_gb.a = true;
      } else if(am.a(this.F, 55, var3)) {
         var1.f_gb = this.f_gb;
      } else {
         var1.f_gb = null;
      }

      var17 = false;
      if(var17) {
         if(var2.Z != null && var2.Z.length >= this.C) {
            var1.Z = var2.Z;
            var1.Fb = var2.Fb;
         } else {
            var14 = this.s;
            var1.Z = var2.Z = new float[var14];
            var1.Fb = var2.Fb = new float[var14];
         }

         for(var14 = 0; var14 < this.s; ++var14) {
            var1.Z[var14] = this.Z[var14];
            var1.Fb[var14] = this.Fb[var14];
         }
      } else {
         var1.Z = this.Z;
         var1.Fb = this.Fb;
      }

      if(ela.a(var3, (byte)-41, this.F)) {
         var1.K = var2.K;
         var1.K.d = this.K.d;
         var1.K.b = this.K.b;
         var1.K.a = true;
      } else {
         boolean var18 = 0 != (2048 & var3);
         if(var18) {
            var1.K = this.K;
         } else {
            var1.K = null;
         }
      }

      if(an.a(var3, (byte)105, this.F)) {
         if(var2.x != null && var2.x.length >= this.C) {
            var1.x = var2.x;
            var1.f_lb = var2.f_lb;
            var1.f_nb = var2.f_nb;
         } else {
            var14 = this.C;
            var1.x = var2.x = new short[var14];
            var1.f_lb = var2.f_lb = new short[var14];
            var1.f_nb = var2.f_nb = new short[var14];
         }

         for(var14 = 0; var14 < this.C; ++var14) {
            var1.x[var14] = this.x[var14];
            var1.f_lb[var14] = this.f_lb[var14];
            var1.f_nb[var14] = this.f_nb[var14];
         }
      } else {
         var1.x = this.x;
         var1.f_lb = this.f_lb;
         var1.f_nb = this.f_nb;
      }

      if(vr.a(this.F, (byte)115, var3)) {
         var1.T = var2.T;
         var1.T.a = this.T.a;
         var1.T.c = this.T.c;
         var1.T.d = true;
      } else if(bw.a(this.F, var3, (byte)103)) {
         var1.T = this.T;
      } else {
         var1.T = null;
      }

      if(nn.a(var3, -88, this.F)) {
         if(var2.O != null && var2.O.length >= this.C) {
            var1.O = var2.O;
         } else {
            var14 = this.C;
            var1.O = var2.O = new short[var14];
         }

         for(var14 = 0; var14 < this.C; ++var14) {
            var1.O[var14] = this.O[var14];
         }
      } else {
         var1.O = this.O;
      }

      if(la.a(-85, this.F, var3)) {
         if(var2.f_bb != null && var2.f_bb.length >= this.Ib) {
            var1.f_bb = var2.f_bb;

            for(var14 = 0; var14 < this.Ib; ++var14) {
               Object[] var20 = var1.f_bb[var14];
               Object[] var16 = this.f_bb[var14];
               ((int[])((int[])var20[0]))[2] = ((int[])((int[])var16[0]))[2];
               ((int[])((int[])var20[0]))[1] = ((int[])((int[])var16[0]))[1];
               ((int[])((int[])var20[0]))[0] = ((int[])((int[])var16[0]))[0];
               ((int[])((int[])var20[0]))[3] = ((int[])((int[])var16[0]))[3];
               ((int[])((int[])var20[0]))[4] = ((int[])((int[])var16[0]))[4];
               ((int[])((int[])var20[0]))[5] = ((int[])((int[])var16[0]))[5];
            }
         } else {
            var14 = this.Ib;
            var1.f_bb = var2.f_bb = new Object[var14][];

            for(int var15 = 0; var15 < this.Ib; ++var15) {
               var1.f_bb[var15] = pt.a(false, this.f_bb[var15]);
            }
         }
      } else {
         var1.f_bb = this.f_bb;
      }

      var1.Eb = this.Eb;
      if(this.r) {
         var1.G = this.G;
         var1.zb = this.zb;
         var1.Gb = this.Gb;
         var1.U = this.U;
         var1.f_tb = this.f_tb;
         var1.q = this.q;
         var1.D = this.D;
         var1.f_kb = this.f_kb;
         var1.r = true;
      } else {
         var1.r = false;
      }

      var1.N = this.N;
      var1.f_wb = this.f_wb;
      var1.I = this.I;
      var1.A = this.A;
      var1.P = this.P;
      var1.f_qb = this.f_qb;
      var1.X = this.X;
      var1.u = this.u;
      var1.f_cb = this.f_cb;
      var1.Cb = this.Cb;
      var1.f_sb = this.f_sb;
      var1.H = this.H;
      var1.E = this.E;
      var1.xb = this.xb;
      return var1;
   }

   final int N() {
      if(!this.r) {
         this.h();
      }

      return this.q;
   }

   final void O(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_ub; ++var4) {
         int var5 = this.f_jb[var4] * var2 + this.Ab[var4] * var3 >> 14;
         this.f_jb[var4] = this.f_jb[var4] * var3 - this.Ab[var4] * var2 >> 14;
         this.Ab[var4] = var5;
      }

      this.j();
      this.r = false;
   }

   private final boolean k() {
      if(this.T.c) {
         return true;
      } else {
         if(this.T.b == null) {
            this.T.b = rta.a((byte)125, this.R, false);
         }

         Object[] var1 = this.T.b;
         bj.a(4, var1, this.yb * 6);
         Unsafe var2 = (Unsafe)this.R[36];
         if(var2 != null) {
            int var7 = this.yb * 3 * 2;
            long var8 = ih.a(0, var1, var7, (byte)86);
            if(var8 == 0L) {
               return false;
            } else {
               for(int var6 = 0; var6 < this.yb; ++var6) {
                  var2.putShort(var8, this.x[var6]);
                  var8 += 2L;
                  var2.putShort(var8, this.f_lb[var6]);
                  var8 += 2L;
                  var2.putShort(var8, this.f_nb[var6]);
                  var8 += 2L;
               }

               oka.a(true, var1);
               this.T.a = var1;
               this.T.c = true;
               this.v = true;
               return true;
            }
         } else {
            ByteBuffer var3 = (ByteBuffer)this.R[57];
            var3.clear();

            for(int var4 = 0; var4 < this.yb; ++var4) {
               var3.putShort(this.x[var4]);
               var3.putShort(this.f_lb[var4]);
               var3.putShort(this.f_nb[var4]);
            }

            if(nda.a(-18243, var1, var3.position(), 0, ((long[])((long[])this.R[50]))[0])) {
               this.T.a = var1;
               this.T.c = true;
               this.v = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   final Object[][] b() {
      return this.xb;
   }

   private final void p() {
      if(this.w != null) {
         this.w.b = false;
      }

   }

   final boolean m() {
      return this.t;
   }

   final void C(int var1) {
      this.z = (short)var1;
      this.j();
      this.l();
   }

   final void i(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var51;
      int[] var50;
      int var48;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         Hb = 0;
         f_ab = 0;
         f_vb = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var48 = var2[var11];
            if(var48 < this.N.length) {
               var50 = this.N[var48];

               for(var51 = 0; var51 < var50.length; ++var51) {
                  var15 = var50[var51];
                  if(this.u == null || (var7 & this.u[var15]) != 0) {
                     Hb += this.Ab[var15];
                     f_ab += this.V[var15];
                     f_vb += this.f_jb[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            Hb = Hb / var10 + var3;
            f_ab = f_ab / var10 + var4;
            f_vb = f_vb / var10 + var5;
            f_ob = true;
         } else {
            Hb = var3;
            f_ab = var4;
            f_vb = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var48 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var48;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.N.length) {
                  var12 = this.N[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var51 = var12[var13];
                     if(this.u == null || (var7 & this.u[var51]) != 0) {
                        this.Ab[var51] += var3;
                        this.V[var51] += var4;
                        this.f_jb[var51] += var5;
                     }
                  }
               }
            }

         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            int var27;
            int var26;
            int var28;
            int var30;
            int var34;
            int[] var35;
            int var32;
            int var33;
            int var38;
            int var39;
            int var36;
            int var37;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(f_ob) {
                     var16 = var8[0] * Hb + var8[3] * f_ab + var8[6] * f_vb + 8192 >> 14;
                     var17 = var8[1] * Hb + var8[4] * f_ab + var8[7] * f_vb + 8192 >> 14;
                     var18 = var8[2] * Hb + var8[5] * f_ab + var8[8] * f_vb + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     Hb = var16;
                     f_ab = var17;
                     f_vb = var18;
                     f_ob = false;
                  }

                  int[] var53 = new int[9];
                  var17 = tda.k[var3];
                  var18 = tda.p[var3];
                  var19 = tda.k[var4];
                  var20 = tda.p[var4];
                  var21 = tda.k[var5];
                  var22 = tda.p[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var53[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var53[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var53[2] = var20 * var17 + 8192 >> 14;
                  var53[3] = var17 * var22 + 8192 >> 14;
                  var53[4] = var17 * var21 + 8192 >> 14;
                  var53[5] = -var18;
                  var53[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var53[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var53[8] = var19 * var17 + 8192 >> 14;
                  int var54 = var53[0] * -Hb + var53[1] * -f_ab + var53[2] * -f_vb + 8192 >> 14;
                  var26 = var53[3] * -Hb + var53[4] * -f_ab + var53[5] * -f_vb + 8192 >> 14;
                  var27 = var53[6] * -Hb + var53[7] * -f_ab + var53[8] * -f_vb + 8192 >> 14;
                  var28 = var54 + Hb;
                  int var55 = var26 + f_ab;
                  var30 = var27 + f_vb;
                  int[] var56 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var57 = 0; var57 < 3; ++var57) {
                           var34 += var53[var32 * 3 + var57] * var8[var33 * 3 + var57];
                        }

                        var56[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var53[0] * var13 + var53[1] * var51 + var53[2] * var15 + 8192 >> 14;
                  var33 = var53[3] * var13 + var53[4] * var51 + var53[5] * var15 + 8192 >> 14;
                  var34 = var53[6] * var13 + var53[7] * var51 + var53[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var55;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var56[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var48;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.N.length) {
                        int[] var41 = this.N[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.u == null || (var7 & this.u[var43]) != 0) {
                              int var44 = var35[0] * this.Ab[var43] + var35[1] * this.V[var43] + var35[2] * this.f_jb[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.Ab[var43] + var35[4] * this.V[var43] + var35[5] * this.f_jb[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.Ab[var43] + var35[7] * this.V[var43] + var35[8] * this.f_jb[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.Ab[var43] = var44;
                              this.V[var43] = var45;
                              this.f_jb[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.N.length) {
                        var12 = this.N[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.u == null || (var7 & this.u[var51]) != 0) {
                              this.Ab[var51] -= Hb;
                              this.V[var51] -= f_ab;
                              this.f_jb[var51] -= f_vb;
                              if(var5 != 0) {
                                 var15 = tda.p[var5];
                                 var16 = tda.k[var5];
                                 var17 = this.V[var51] * var15 + this.Ab[var51] * var16 + 16383 >> 14;
                                 this.V[var51] = this.V[var51] * var16 - this.Ab[var51] * var15 + 16383 >> 14;
                                 this.Ab[var51] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = tda.p[var3];
                                 var16 = tda.k[var3];
                                 var17 = this.V[var51] * var16 - this.f_jb[var51] * var15 + 16383 >> 14;
                                 this.f_jb[var51] = this.V[var51] * var15 + this.f_jb[var51] * var16 + 16383 >> 14;
                                 this.V[var51] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = tda.p[var4];
                                 var16 = tda.k[var4];
                                 var17 = this.f_jb[var51] * var15 + this.Ab[var51] * var16 + 16383 >> 14;
                                 this.f_jb[var51] = this.f_jb[var51] * var16 - this.Ab[var51] * var15 + 16383 >> 14;
                                 this.Ab[var51] = var17;
                              }

                              this.Ab[var51] += Hb;
                              this.V[var51] += f_ab;
                              this.f_jb[var51] += f_vb;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.N.length) {
                           var12 = this.N[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var51 = var12[var13];
                              if(this.u == null || (var7 & this.u[var51]) != 0) {
                                 var15 = this.P[var51];
                                 var16 = this.P[var51 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.A[var17] - 1;
                                    if(var18 == -1) {
                                       break;
                                    }

                                    if(var5 != 0) {
                                       var19 = tda.p[var5];
                                       var20 = tda.k[var5];
                                       var21 = this.f_eb[var18] * var19 + this.Jb[var18] * var20 + 16383 >> 14;
                                       this.f_eb[var18] = (short)(this.f_eb[var18] * var20 - this.Jb[var18] * var19 + 16383 >> 14);
                                       this.Jb[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = tda.p[var3];
                                       var20 = tda.k[var3];
                                       var21 = this.f_eb[var18] * var20 - this.f_ib[var18] * var19 + 16383 >> 14;
                                       this.f_ib[var18] = (short)(this.f_eb[var18] * var19 + this.f_ib[var18] * var20 + 16383 >> 14);
                                       this.f_eb[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = tda.p[var4];
                                       var20 = tda.k[var4];
                                       var21 = this.f_ib[var18] * var19 + this.Jb[var18] * var20 + 16383 >> 14;
                                       this.f_ib[var18] = (short)(this.f_ib[var18] * var20 - this.Jb[var18] * var19 + 16383 >> 14);
                                       this.Jb[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.l();
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(f_ob) {
                     var16 = var8[0] * Hb + var8[3] * f_ab + var8[6] * f_vb + 8192 >> 14;
                     var17 = var8[1] * Hb + var8[4] * f_ab + var8[7] * f_vb + 8192 >> 14;
                     var18 = var8[2] * Hb + var8[5] * f_ab + var8[8] * f_vb + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     Hb = var16;
                     f_ab = var17;
                     f_vb = var18;
                     f_ob = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -Hb + 8192 >> 14;
                  var20 = var17 * -f_ab + 8192 >> 14;
                  var21 = var18 * -f_vb + 8192 >> 14;
                  var22 = var19 + Hb;
                  var23 = var20 + f_ab;
                  var24 = var21 + f_vb;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var51 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var48;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.N.length) {
                        var35 = this.N[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.u == null || (var7 & this.u[var37]) != 0) {
                              var38 = var29[0] * this.Ab[var37] + var29[1] * this.V[var37] + var29[2] * this.f_jb[var37] + 8192 >> 14;
                              var39 = var29[3] * this.Ab[var37] + var29[4] * this.V[var37] + var29[5] * this.f_jb[var37] + 8192 >> 14;
                              var40 = var29[6] * this.Ab[var37] + var29[7] * this.V[var37] + var29[8] * this.f_jb[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.Ab[var37] = var38;
                              this.V[var37] = var39;
                              this.f_jb[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.N.length) {
                        var12 = this.N[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.u == null || (var7 & this.u[var51]) != 0) {
                              this.Ab[var51] -= Hb;
                              this.V[var51] -= f_ab;
                              this.f_jb[var51] -= f_vb;
                              this.Ab[var51] = this.Ab[var51] * var3 >> 7;
                              this.V[var51] = this.V[var51] * var4 >> 7;
                              this.f_jb[var51] = this.f_jb[var51] * var5 >> 7;
                              this.Ab[var51] += Hb;
                              this.V[var51] += f_ab;
                              this.f_jb[var51] += f_vb;
                           }
                        }
                     }
                  }
               }

            } else {
               boolean var47;
               Object[] var49;
               Object[] var52;
               if(var1 == 5) {
                  if(this.f_wb != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.f_wb.length) {
                           var50 = this.f_wb[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.f_cb == null || (var7 & this.f_cb[var15]) != 0) {
                                 var16 = (this.S[var15] & 255) + var3 * 8;
                                 if(var16 < 0) {
                                    var16 = 0;
                                 } else if(var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.S[var15] = (byte)var16;
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.Eb != null) {
                           for(var11 = 0; var11 < this.Ib; ++var11) {
                              var49 = this.Eb[var11];
                              var52 = this.f_bb[var11];
                              ((int[])((int[])var52[0]))[3] = ((int[])((int[])var52[0]))[3] & 16777215 | 255 - (this.S[((int[])((int[])var49[1]))[1]] & 255) << 24;
                           }
                        }

                        this.p();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.f_wb != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.f_wb.length) {
                           var50 = this.f_wb[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.f_cb == null || (var7 & this.f_cb[var15]) != 0) {
                                 var16 = this.f_pb[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if(var19 < 0) {
                                    var19 = 0;
                                 } else if(var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.f_pb[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.Eb != null) {
                           for(var11 = 0; var11 < this.Ib; ++var11) {
                              var49 = this.Eb[var11];
                              var52 = this.f_bb[var11];
                              ((int[])((int[])var52[0]))[3] = ((int[])((int[])var52[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var49[1]))[1]] & '\uffff'] & 16777215;
                           }
                        }

                        this.p();
                     }
                  }

               } else {
                  Object[] var14;
                  if(var1 == 8) {
                     if(this.I != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.I.length) {
                              var12 = this.I[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.f_bb[var12[var13]];
                                 ((int[])((int[])var14[0]))[5] += var3;
                                 ((int[])((int[])var14[0]))[1] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.I != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.I.length) {
                              var12 = this.I[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.f_bb[var12[var13]];
                                 ((int[])((int[])var14[0]))[0] = ((int[])((int[])var14[0]))[0] * var3 >> 7;
                                 ((int[])((int[])var14[0]))[2] = ((int[])((int[])var14[0]))[2] * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.I != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.I.length) {
                              var12 = this.I[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.f_bb[var12[var13]];
                                 ((int[])((int[])var14[0]))[4] = ((int[])((int[])var14[0]))[4] + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   final Object[][] a() {
      return this.E;
   }

   final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      int[] var25;
      int var24;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         Hb = 0;
         f_ab = 0;
         f_vb = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var23 = var2[var10];
            if(var23 < this.N.length) {
               var25 = this.N[var23];

               for(var24 = 0; var24 < var25.length; ++var24) {
                  var14 = var25[var24];
                  Hb += this.Ab[var14];
                  f_ab += this.V[var14];
                  f_vb += this.f_jb[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            Hb = Hb / var9 + var3;
            f_ab = f_ab / var9 + var4;
            f_vb = f_vb / var9 + var5;
         } else {
            Hb = var3;
            f_ab = var4;
            f_vb = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.N.length) {
                  var11 = this.N[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var24 = var11[var12];
                     this.Ab[var24] += var3;
                     this.V[var24] += var4;
                     this.f_jb[var24] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var17;
            int var16;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.N.length) {
                     var11 = this.N[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           this.Ab[var24] -= Hb;
                           this.V[var24] -= f_ab;
                           this.f_jb[var24] -= f_vb;
                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.V[var24] * var14 + this.Ab[var24] * var15 + 16383 >> 14;
                              this.V[var24] = this.V[var24] * var15 - this.Ab[var24] * var14 + 16383 >> 14;
                              this.Ab[var24] = var16;
                           }

                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.V[var24] * var15 - this.f_jb[var24] * var14 + 16383 >> 14;
                              this.f_jb[var24] = this.V[var24] * var14 + this.f_jb[var24] * var15 + 16383 >> 14;
                              this.V[var24] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.f_jb[var24] * var14 + this.Ab[var24] * var15 + 16383 >> 14;
                              this.f_jb[var24] = this.f_jb[var24] * var15 - this.Ab[var24] * var14 + 16383 >> 14;
                              this.Ab[var24] = var16;
                           }

                           this.Ab[var24] += Hb;
                           this.V[var24] += f_ab;
                           this.f_jb[var24] += f_vb;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           this.Ab[var24] -= Hb;
                           this.V[var24] -= f_ab;
                           this.f_jb[var24] -= f_vb;
                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.V[var24] * var15 - this.f_jb[var24] * var14 + 16383 >> 14;
                              this.f_jb[var24] = this.V[var24] * var14 + this.f_jb[var24] * var15 + 16383 >> 14;
                              this.V[var24] = var16;
                           }

                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.V[var24] * var14 + this.Ab[var24] * var15 + 16383 >> 14;
                              this.V[var24] = this.V[var24] * var15 - this.Ab[var24] * var14 + 16383 >> 14;
                              this.Ab[var24] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.f_jb[var24] * var14 + this.Ab[var24] * var15 + 16383 >> 14;
                              this.f_jb[var24] = this.f_jb[var24] * var15 - this.Ab[var24] * var14 + 16383 >> 14;
                              this.Ab[var24] = var16;
                           }

                           this.Ab[var24] += Hb;
                           this.V[var24] += f_ab;
                           this.f_jb[var24] += f_vb;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.N.length) {
                        var11 = this.N[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           var14 = this.P[var24];
                           var15 = this.P[var24 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.A[var16] - 1;
                              if(var17 == -1) {
                                 break;
                              }

                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = tda.p[var5];
                                 var19 = tda.k[var5];
                                 var20 = this.f_eb[var17] * var18 + this.Jb[var17] * var19 + 16383 >> 14;
                                 this.f_eb[var17] = (short)(this.f_eb[var17] * var19 - this.Jb[var17] * var18 + 16383 >> 14);
                                 this.Jb[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = tda.p[var3];
                                 var19 = tda.k[var3];
                                 var20 = this.f_eb[var17] * var19 - this.f_ib[var17] * var18 + 16383 >> 14;
                                 this.f_ib[var17] = (short)(this.f_eb[var17] * var18 + this.f_ib[var17] * var19 + 16383 >> 14);
                                 this.f_eb[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = tda.p[var4];
                                 var19 = tda.k[var4];
                                 var20 = this.f_ib[var17] * var18 + this.Jb[var17] * var19 + 16383 >> 14;
                                 this.f_ib[var17] = (short)(this.f_ib[var17] * var19 - this.Jb[var17] * var18 + 16383 >> 14);
                                 this.Jb[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.l();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.N.length) {
                     var11 = this.N[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var24 = var11[var12];
                        this.Ab[var24] -= Hb;
                        this.V[var24] -= f_ab;
                        this.f_jb[var24] -= f_vb;
                        this.Ab[var24] = this.Ab[var24] * var3 >> 7;
                        this.V[var24] = this.V[var24] * var4 >> 7;
                        this.f_jb[var24] = this.f_jb[var24] * var5 >> 7;
                        this.Ab[var24] += Hb;
                        this.V[var24] += f_ab;
                        this.f_jb[var24] += f_vb;
                     }
                  }
               }

            } else {
               boolean var21;
               Object[] var22;
               Object[] var26;
               if(var1 == 5) {
                  if(this.f_wb != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var23 = var2[var10];
                        if(var23 < this.f_wb.length) {
                           var25 = this.f_wb[var23];

                           for(var24 = 0; var24 < var25.length; ++var24) {
                              var14 = var25[var24];
                              var15 = (this.S[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.S[var14] = (byte)var15;
                           }

                           var21 |= var25.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.Eb != null) {
                           for(var10 = 0; var10 < this.Ib; ++var10) {
                              var22 = this.Eb[var10];
                              var26 = this.f_bb[var10];
                              ((int[])((int[])var26[0]))[3] = ((int[])((int[])var26[0]))[3] & 16777215 | 255 - (this.S[((int[])((int[])var22[1]))[1]] & 255) << 24;
                           }
                        }

                        this.p();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.f_wb != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var23 = var2[var10];
                        if(var23 < this.f_wb.length) {
                           var25 = this.f_wb[var23];

                           for(var24 = 0; var24 < var25.length; ++var24) {
                              var14 = var25[var24];
                              var15 = this.f_pb[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.f_pb[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var25.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.Eb != null) {
                           for(var10 = 0; var10 < this.Ib; ++var10) {
                              var22 = this.Eb[var10];
                              var26 = this.f_bb[var10];
                              ((int[])((int[])var26[0]))[3] = ((int[])((int[])var26[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var22[1]))[1]] & '\uffff'] & 16777215;
                           }
                        }

                        this.p();
                     }
                  }

               } else {
                  Object[] var13;
                  if(var1 == 8) {
                     if(this.I != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.I.length) {
                              var11 = this.I[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.f_bb[var11[var12]];
                                 ((int[])((int[])var13[0]))[5] += var3;
                                 ((int[])((int[])var13[0]))[1] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.I != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.I.length) {
                              var11 = this.I[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.f_bb[var11[var12]];
                                 ((int[])((int[])var13[0]))[0] = ((int[])((int[])var13[0]))[0] * var3 >> 7;
                                 ((int[])((int[])var13[0]))[2] = ((int[])((int[])var13[0]))[2] * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.I != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.I.length) {
                              var11 = this.I[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.f_bb[var11[var12]];
                                 ((int[])((int[])var13[0]))[4] = ((int[])((int[])var13[0]))[4] + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   final int ga() {
      return this.z;
   }

   private final void g() {
      if(this.v) {
         this.v = false;
         boolean var1;
         int var2;
         boolean var4;
         if(this.E == null && this.xb == null && this.Eb == null) {
            var2 = this.W;
            var1 = (var2 & 55) != 0;
            if(!var1) {
               boolean var3 = false;
               var4 = false;
               boolean var5 = false;
               boolean var6;
               int var7;
               int var8;
               boolean var9;
               boolean var10;
               if(this.Ab != null) {
                  var7 = this.W;
                  var8 = this.F;
                  var9 = -1 != ~(458752 & var7);
                  if(!var9) {
                     var10 = -1 != ~(33 & var7);
                     var9 = var10;
                  }

                  var6 = var9 || fk.a(var8, var7, (byte)119);
                  if(!var6) {
                     if(this.Q != null && !this.Q.b()) {
                        this.v = true;
                     } else {
                        if(!this.r) {
                           this.h();
                        }

                        var3 = true;
                     }
                  }
               }

               if(this.V != null) {
                  var7 = this.W;
                  var8 = this.F;
                  var9 = -1 != ~(var7 & 458752);
                  if(!var9) {
                     var10 = (var7 & 34) != 0;
                     var9 = var10;
                  }

                  var6 = var9 || fk.a(var8, var7, (byte)124);
                  if(!var6) {
                     if(this.Q != null && !this.Q.b()) {
                        this.v = true;
                     } else {
                        if(!this.r) {
                           this.h();
                        }

                        var4 = true;
                     }
                  }
               }

               if(this.f_jb != null) {
                  var7 = this.W;
                  var8 = this.F;
                  var6 = (458752 & var7) != 0 || hda.a(var7, var8, 8) || fk.a(var8, var7, (byte)73);
                  if(!var6) {
                     if(this.Q != null && !this.Q.b()) {
                        this.v = true;
                     } else {
                        if(!this.r) {
                           this.h();
                        }

                        var5 = true;
                     }
                  }
               }

               if(var3) {
                  this.Ab = null;
               }

               if(var4) {
                  this.V = null;
               }

               if(var5) {
                  this.f_jb = null;
               }
            }
         }

         if(this.A != null && this.Ab == null && this.V == null && this.f_jb == null) {
            this.A = null;
            this.P = null;
         }

         int var11;
         if(this.B != null) {
            var2 = this.W;
            var11 = this.F;
            var4 = 0 != (55 & var11)?tha.a(var2, -23901, var11):tb.a(10, var11, var2);
            var1 = var4 | 0 != (65536 & var2) | ns.a(var2, (byte)-120, var11);
            if(!var1) {
               label322: {
                  label321: {
                     if((this.F & 55) != 0) {
                        if(this.f_gb == null || this.f_gb.b()) {
                           break label321;
                        }
                     } else if(this.w == null || this.w.b()) {
                        break label321;
                     }

                     this.v = true;
                     break label322;
                  }

                  this.f_ib = null;
                  this.f_eb = null;
                  this.Jb = null;
                  this.B = null;
               }
            }
         }

         if(this.f_pb != null && !nca.a(this.F, (byte)104, this.W)) {
            if(this.w != null && !this.w.b()) {
               this.v = true;
            } else {
               this.f_pb = null;
            }
         }

         if(this.S != null) {
            var2 = this.W;
            var11 = this.F;
            var1 = tqa.a(var11, -62, var2) | -1 != ~(var2 & 262144) || tb.a(120, var11, var2);
            if(!var1) {
               if(this.w != null && !this.w.b()) {
                  this.v = true;
               } else {
                  this.S = null;
               }
            }
         }

         if(this.Z != null) {
            var2 = this.W;
            var11 = this.F;
            var4 = false;
            var1 = var4 || ela.a(var2, (byte)-42, var11);
            if(!var1) {
               if(this.K != null && !this.K.b()) {
                  this.v = true;
               } else {
                  this.Fb = null;
                  this.Z = null;
               }
            }
         }

         if(this.O != null) {
            var2 = this.W;
            var11 = this.F;
            var1 = nn.a(var2, -44, var11) | 0 != (var2 & 2048) || tb.a(70, var11, var2);
            if(!var1) {
               if(this.w != null && !this.w.b()) {
                  this.v = true;
               } else {
                  this.O = null;
               }
            }
         }

         if(this.x != null) {
            var2 = this.W;
            var11 = this.F;
            var1 = (393216 & var2) != 0 | an.a(var2, (byte)96, var11) || vr.a(var11, (byte)-91, var2);
            if(!var1) {
               if((this.T == null || this.T.a()) && (this.w == null || this.w.b())) {
                  this.f_nb = null;
                  this.f_lb = null;
                  this.x = null;
               } else {
                  this.v = true;
               }
            }
         }

         if(this.f_qb != null) {
            if(this.Q != null && !this.Q.b()) {
               this.v = true;
            } else {
               this.f_qb = null;
            }
         }

         if(this.X != null) {
            if(this.w != null && !this.w.b()) {
               this.v = true;
            } else {
               this.X = null;
            }
         }

         if(this.f_wb != null) {
            var2 = this.W;
            var1 = 0 != (var2 & 384);
            if(!var1) {
               this.f_wb = (int[][])null;
               this.f_cb = null;
            }
         }

         if(this.N != null) {
            var2 = this.W;
            var1 = -1 != ~(32 & var2);
            if(!var1) {
               this.N = (int[][])null;
               this.u = null;
            }
         }

         if(this.I != null) {
            var2 = this.W;
            var1 = (1024 & var2) != 0;
            if(!var1) {
               this.I = (int[][])null;
            }
         }

         if(this.Cb != null && (this.W & 2048) == 0 && (this.W & 262144) == 0) {
            this.Cb = null;
            this.f_sb = null;
            this.H = null;
         }

      }
   }

   private final void j() {
      if(this.Q != null) {
         this.Q.b = false;
      }

   }

   final void S() {
      int var1;
      for(var1 = 0; var1 < this.f_ub; ++var1) {
         this.f_jb[var1] = -this.f_jb[var1];
      }

      for(var1 = 0; var1 < this.s; ++var1) {
         this.f_ib[var1] = (short)(-this.f_ib[var1]);
      }

      for(var1 = 0; var1 < this.C; ++var1) {
         short var2 = this.x[var1];
         this.x[var1] = this.f_nb[var1];
         this.f_nb[var1] = var2;
      }

      this.j();
      this.l();
      this.o();
      this.r = false;
   }

   final void G(int var1) {
      if(this.Q != null) {
         this.Q.a = fk.a(this.F, var1, (byte)105);
      }

      if(this.K != null) {
         this.K.a = ela.a(var1, (byte)-103, this.F);
      }

      if(this.w != null) {
         this.w.a = tb.a(122, this.F, var1);
      }

      if(this.f_gb != null) {
         this.f_gb.a = tha.a(var1, -23901, this.F);
      }

      this.W = var1;
      if(this.f_fb != null && (this.W & 65536) == 0) {
         this.Jb = this.f_fb.b;
         this.f_eb = this.f_fb.c;
         this.f_ib = this.f_fb.a;
         this.B = this.f_fb.d;
         this.f_fb = null;
      }

      this.v = true;
      this.g();
   }

   final void K(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.f_ub; ++var4) {
         if(var1 != 0) {
            this.Ab[var4] += var1;
         }

         if(var2 != 0) {
            this.V[var4] += var2;
         }

         if(var3 != 0) {
            this.f_jb[var4] += var3;
         }
      }

      this.j();
      this.r = false;
   }

   final void DA(short var1, short var2) {
      Object[] var3 = this.R;
      qa var4 = ((ta)(this.R == null?null:var3[38])).k;

      for(int var5 = 0; var5 < this.C; ++var5) {
         if(this.O[var5] == var1) {
            this.O[var5] = var2;
         }
      }

      byte var12 = 0;
      byte var6 = 0;
      if(var1 != -1) {
         Object[] var7 = var4.a(var1 & '\uffff', (byte)123);
         var12 = ((byte[])((byte[])var7[0]))[3];
         var6 = ((byte[])((byte[])var7[0]))[1];
      }

      byte var13 = 0;
      byte var8 = 0;
      if(var2 != -1) {
         Object[] var9 = var4.a(var2 & '\uffff', (byte)92);
         var13 = ((byte[])((byte[])var9[0]))[3];
         var8 = ((byte[])((byte[])var9[0]))[1];
         if(((byte[])((byte[])var9[0]))[5] != 0 || ((byte[])((byte[])var9[0]))[6] != 0) {
            this.t = true;
         }
      }

      if(var12 != var13 | var6 != var8) {
         if(this.Eb != null) {
            for(int var14 = 0; var14 < this.Ib; ++var14) {
               Object[] var10 = this.Eb[var14];
               Object[] var11 = this.f_bb[var14];
               ((int[])((int[])var11[0]))[3] = ((int[])((int[])var11[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var10[1]))[1]] & '\uffff'] & 16777215;
            }
         }

         this.p();
      }

   }

   final void a(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.C; ++var5) {
         int var6 = this.f_pb[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.f_pb[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.Eb != null) {
         for(var5 = 0; var5 < this.Ib; ++var5) {
            Object[] var10 = this.Eb[var5];
            Object[] var11 = this.f_bb[var5];
            ((int[])((int[])var11[0]))[3] = ((int[])((int[])var11[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var10[1]))[1]] & '\uffff'] & 16777215;
         }
      }

      this.p();
   }

   final void fa(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_ub; ++var4) {
         int var5 = this.V[var4] * var2 + this.Ab[var4] * var3 >> 14;
         this.V[var4] = this.V[var4] * var3 - this.Ab[var4] * var2 >> 14;
         this.Ab[var4] = var5;
      }

      this.j();
      this.r = false;
   }

   private static final byte[] a(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final void YA(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         Hb = 0;
         f_ab = 0;
         f_vb = 0;

         for(var10 = 0; var10 < this.f_ub; ++var10) {
            Hb += this.Ab[var10];
            f_ab += this.V[var10];
            f_vb += this.f_jb[var10];
            ++var5;
         }

         if(var5 > 0) {
            Hb = Hb / var5 + var2;
            f_ab = f_ab / var5 + var3;
            f_vb = f_vb / var5 + var4;
         } else {
            Hb = var2;
            f_ab = var3;
            f_vb = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.f_ub; ++var5) {
            this.Ab[var5] += var2;
            this.V[var5] += var3;
            this.f_jb[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.f_ub; ++var5) {
               this.Ab[var5] -= Hb;
               this.V[var5] -= f_ab;
               this.f_jb[var5] -= f_vb;
               if(var4 != 0) {
                  var10 = tda.p[var4];
                  var7 = tda.k[var4];
                  var8 = this.V[var5] * var10 + this.Ab[var5] * var7 + 16383 >> 14;
                  this.V[var5] = this.V[var5] * var7 - this.Ab[var5] * var10 + 16383 >> 14;
                  this.Ab[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = tda.p[var2];
                  var7 = tda.k[var2];
                  var8 = this.V[var5] * var7 - this.f_jb[var5] * var10 + 16383 >> 14;
                  this.f_jb[var5] = this.V[var5] * var10 + this.f_jb[var5] * var7 + 16383 >> 14;
                  this.V[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = tda.p[var3];
                  var7 = tda.k[var3];
                  var8 = this.f_jb[var5] * var10 + this.Ab[var5] * var7 + 16383 >> 14;
                  this.f_jb[var5] = this.f_jb[var5] * var7 - this.Ab[var5] * var10 + 16383 >> 14;
                  this.Ab[var5] = var8;
               }

               this.Ab[var5] += Hb;
               this.V[var5] += f_ab;
               this.f_jb[var5] += f_vb;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.f_ub; ++var5) {
               this.Ab[var5] -= Hb;
               this.V[var5] -= f_ab;
               this.f_jb[var5] -= f_vb;
               this.Ab[var5] = this.Ab[var5] * var2 / 128;
               this.V[var5] = this.V[var5] * var3 / 128;
               this.f_jb[var5] = this.f_jb[var5] * var4 / 128;
               this.Ab[var5] += Hb;
               this.V[var5] += f_ab;
               this.f_jb[var5] += f_vb;
            }

         } else {
            Object[] var6;
            Object[] var11;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.C; ++var5) {
                  var10 = (this.S[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.S[var5] = (byte)var10;
               }

               if(this.Eb != null) {
                  for(var5 = 0; var5 < this.Ib; ++var5) {
                     var6 = this.Eb[var5];
                     var11 = this.f_bb[var5];
                     ((int[])((int[])var11[0]))[3] = ((int[])((int[])var11[0]))[3] & 16777215 | 255 - (this.S[((int[])((int[])var6[1]))[1]] & 255) << 24;
                  }
               }

               this.p();
            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.C; ++var5) {
                  var10 = this.f_pb[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.f_pb[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.Eb != null) {
                  for(var5 = 0; var5 < this.Ib; ++var5) {
                     var6 = this.Eb[var5];
                     var11 = this.f_bb[var5];
                     ((int[])((int[])var11[0]))[3] = ((int[])((int[])var11[0]))[3] & -16777216 | tpa.f[this.f_pb[((int[])((int[])var6[1]))[1]] & '\uffff'] & 16777215;
                  }
               }

               this.p();
            } else if(var1 == 8) {
               for(var5 = 0; var5 < this.Ib; ++var5) {
                  var6 = this.f_bb[var5];
                  ((int[])((int[])var6[0]))[5] += var2;
                  ((int[])((int[])var6[0]))[1] += var3;
               }

            } else if(var1 == 10) {
               for(var5 = 0; var5 < this.Ib; ++var5) {
                  var6 = this.f_bb[var5];
                  ((int[])((int[])var6[0]))[0] = ((int[])((int[])var6[0]))[0] * var2 >> 7;
                  ((int[])((int[])var6[0]))[2] = ((int[])((int[])var6[0]))[2] * var3 >> 7;
               }

            } else if(var1 == 9) {
               for(var5 = 0; var5 < this.Ib; ++var5) {
                  var6 = this.f_bb[var5];
                  ((int[])((int[])var6[0]))[4] = ((int[])((int[])var6[0]))[4] + var2 & 16383;
               }

            }
         }
      }
   }

   final void e() {}

   final boolean d() {
      if(this.O == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < this.O.length; ++var2) {
            if(this.O[var2] != -1) {
               Object[] var1 = this.R;
               if(!((ta)(this.R == null?null:var1[38])).k.a(-20460, (int)this.O[var2])) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   hu(Object[] var1, int var2, int var3, boolean var4, boolean var5) {
	  super();
      boolean var6;
      int var7;
      label67: {
         this.t = false;
         this.v = true;
         this.f_ub = 0;
         this.s = 0;
         this.Y = false;
         this.r = false;
         this.p = 0;
         this.C = 0;
         this.Bb = false;
         this.yb = 0;
         this.R = var1;
         this.W = var2;
         this.F = var3;
         this.Bb = var5;
         if(!var4) {
            var7 = this.W;
            var6 = (var7 & 2048) != 0;
            if(!var6) {
               break label67;
            }
         }

         this.Q = new sk(fk.a(this.F, this.W, (byte)81));
      }

      label61: {
         if(!var4) {
            var7 = this.W;
            var6 = 0 != (2048 & var7);
            if(!var6) {
               break label61;
            }
         }

         this.K = new sk(ela.a(this.W, (byte)-32, this.F));
      }

      label55: {
         if(!var4) {
            var7 = this.W;
            var6 = -1 != ~(var7 & 2048);
            if(!var6) {
               break label55;
            }
         }

         this.w = new sk(tb.a(113, this.F, this.W));
      }

      if(var4 || am.a(this.F, 55, this.W)) {
         this.f_gb = new sk(tha.a(this.W, -23901, this.F));
      }

      if(var4 || bw.a(this.F, this.W, (byte)109)) {
         this.T = new fia(vr.a(this.F, (byte)-73, this.W));
      }

      if(var4 && var5) {
         this.Q.c = this.Q.d = mc.a(-66, this.R, this.Bb);
         this.K.c = this.K.d = mc.a(-99, this.R, this.Bb);
         this.w.c = this.w.d = mc.a(-79, this.R, this.Bb);
         this.f_gb.c = this.f_gb.d = mc.a(-87, this.R, this.Bb);
      }

   }

}
