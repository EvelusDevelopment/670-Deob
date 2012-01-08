import jaclib.memory.Stream;
import jaggl.OpenGL;

final class qna extends ka {

   private short f_mb;
   private int[][] Eb;
   private short[] Cb;
   private short[] f_qb;
   private byte B;
   private boolean O = false;
   private short f_rb;
   private byte[] f_kb;
   private short[] f_gb;
   private int f_vb = 0;
   private boolean E = true;
   private short[] Z;
   private static int[] f_ib = new int[8];
   private int[][] f_ab;
   private dr v;
   private int[] Fb;
   private static long[] t;
   private short f_ob;
   private Object[] xb;
   private Object[][] f_ub;
   private static int f_lb;
   private boolean w = false;
   private short X;
   private short[] u;
   private short L;
   private short[] f_hb;
   private static int[] x = new int[8];
   private static int I;
   private static float[] f_tb = new float[2];
   private in D;
   private int F;
   private int zb = 0;
   private int[] f_cb;
   private short[] Y;
   private int[] Gb;
   private short Q;
   private int[] f_jb;
   private int f_db = 0;
   private short W;
   private short[] N;
   private int H = 0;
   private Object[][] G;
   private short[] M;
   private short f_sb;
   private Object[] A;
   private short C;
   private int[][] Hb;
   private Object[] T;
   private Object[] f_nb;
   private Object[] y;
   private static int f_fb;
   private static boolean R;
   private Object[] z;
   private Object[][] f_bb;
   private byte[] p;
   private int r;
   private static int[] f_wb = new int[8];
   private float[] s;
   private Object[] q;
   private int yb = 0;
   private boolean U = false;
   private float[] P;
   private short[] Ab;
   private short Db;
   private Object[][] f_eb;
   private short[] Bb;
   private int K;
   private int[] f_pb;


   final boolean XA() {
      return this.w;
   }

   private final void b(Object[] var1) {
      if(this.f_ub != null) {
         Object[] var2 = (Object[])((Object[])this.xb[32]);
         OpenGL.glPushMatrix();
         pea.a(!this.w, this.xb, false);
         pda.a(this.xb, -21342, false);
         nqa.a((Object[])((Object[])this.xb[42]), (Object[])null, 20798, (Object[])((Object[])this.xb[29]), this.xb, (Object[])null);

         for(int var3 = 0; var3 < this.F; ++var3) {
            Object[] var4 = this.f_ub[var3];
            Object[] var5 = this.G[var3];
            if(!((boolean[])((boolean[])var4[3]))[0] || !iq.a((byte)-86, this.xb)) {
               float var6 = (float)(this.f_cb[((int[])((int[])var4[1]))[1]] + this.f_cb[((int[])((int[])var4[1]))[2]] + this.f_cb[((int[])((int[])var4[1]))[3]]) * 0.3333333F;
               float var7 = (float)(this.f_pb[((int[])((int[])var4[1]))[1]] + this.f_pb[((int[])((int[])var4[1]))[2]] + this.f_pb[((int[])((int[])var4[1]))[3]]) * 0.3333333F;
               float var8 = (float)(this.f_jb[((int[])((int[])var4[1]))[1]] + this.f_jb[((int[])((int[])var4[1]))[2]] + this.f_jb[((int[])((int[])var4[1]))[3]]) * 0.3333333F;
               float var9 = ((float[])((float[])var1[0]))[0] * var6 + ((float[])((float[])var1[0]))[4] * var7 + ((float[])((float[])var1[0]))[8] * var8 + ((float[])((float[])var1[0]))[12];
               float var10 = ((float[])((float[])var1[0]))[1] * var6 + ((float[])((float[])var1[0]))[5] * var7 + ((float[])((float[])var1[0]))[9] * var8 + ((float[])((float[])var1[0]))[13];
               float var11 = ((float[])((float[])var1[0]))[2] * var6 + ((float[])((float[])var1[0]))[6] * var7 + ((float[])((float[])var1[0]))[10] * var8 + ((float[])((float[])var1[0]))[14];
               float var12 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + var10 * var10 + var11 * var11))) * (float)((int[])((int[])var4[1]))[0];
               int var13 = ((int[])((int[])var5[0]))[1];
               int var14 = ((int[])((int[])var5[0]))[2] * ((short[])((short[])var4[2]))[0] >> 7;
               int var15 = ((int[])((int[])var5[0]))[4] * ((short[])((short[])var4[2]))[2] >> 7;
               float var16 = var9 + (float)((int[])((int[])var5[0]))[5] - var9 * var12;
               float var17 = var10 + (float)((int[])((int[])var5[0]))[3] - var10 * var12;
               float var18 = var11 - var11 * var12;
               float[] var21;
               float[] var23;
               float[] var22;
               float[] var25;
               float[] var24;
               if(var13 != 0) {
                  float var19 = cla.b[var13 & 16383];
                  float var20 = cla.c[var13 & 16383];
                  ((float[])((float[])var2[0]))[0] = var19 * (float)var14;
                  if(var5 != null && var5.length == 8 && var5[2].equals(Integer.valueOf(1))) {
                     this.Y = null;
                  }

                  ((float[])((float[])var2[0]))[1] = var20 * (float)var14;
                  ((float[])((float[])var2[0]))[5] = var19 * (float)var15;
                  ((float[])((float[])var2[0]))[10] = 1.0F;
                  ((float[])((float[])var2[0]))[4] = (float)var15 * -var20;
                  var21 = (float[])((float[])var2[0]);
                  var22 = (float[])((float[])var2[0]);
                  var23 = (float[])((float[])var2[0]);
                  ((float[])((float[])var2[0]))[9] = 0.0F;
                  var23[8] = 0.0F;
                  var21[2] = 0.0F;
                  var22[6] = 0.0F;
               } else {
                  ((float[])((float[])var2[0]))[10] = 1.0F;
                  ((float[])((float[])var2[0]))[0] = (float)var14;
                  ((float[])((float[])var2[0]))[5] = (float)var15;
                  var24 = (float[])((float[])var2[0]);
                  if(var2 != null && var2.length == 4) {
                     this.g();
                  }

                  var25 = (float[])((float[])var2[0]);
                  var21 = (float[])((float[])var2[0]);
                  var22 = (float[])((float[])var2[0]);
                  ((float[])((float[])var2[0]))[9] = 0.0F;
                  var23 = (float[])((float[])var2[0]);
                  var24[1] = 0.0F;
                  var22[6] = 0.0F;
                  var23[8] = 0.0F;
                  var21[4] = 0.0F;
                  var25[2] = 0.0F;
               }

               var24 = (float[])((float[])var2[0]);
               ((float[])((float[])var2[0]))[11] = 0.0F;
               var25 = (float[])((float[])var2[0]);
               ((float[])((float[])var2[0]))[12] = var16;
               ((float[])((float[])var2[0]))[15] = 1.0F;
               var25[7] = 0.0F;
               var24[3] = 0.0F;
               if(var1 != null && var1.length == 4 && var1[1].equals(Integer.valueOf(2))) {
                  ((long[])((long[])this.z[1]))[4] = ((long[])((long[])this.z[1]))[1];
               }

               ((float[])((float[])var2[0]))[14] = var18;
               ((float[])((float[])var2[0]))[13] = var17;
               cna.a(var2, this.xb, (byte)-91);
               int var26 = ((int[])((int[])var5[0]))[0];
               OpenGL.glColor4ub((byte)(var26 >> 16), (byte)(var26 >> 8), (byte)var26, (byte)(var26 >> 24));
               jia.a(this.xb, 0, ((short[])((short[])var4[2]))[1]);
               kd.a(3042, this.xb, ((byte[])((byte[])var4[0]))[0]);
               OpenGL.glDrawArrays(7, 0, 4);
            }
         }

         pea.a(true, this.xb, false);
         OpenGL.glPopMatrix();
      }

   }

   final void v(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.f_vb; ++var4) {
         if(var1 != 128) {
            this.f_cb[var4] = this.f_cb[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.f_pb[var4] = this.f_pb[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.f_jb[var4] = this.f_jb[var4] * var3 >> 7;
         }
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   private final void c(Object[] var1) {
      if(((int[])((int[])this.xb[48])).length < this.yb) {
         this.xb[48] = new int[this.yb];
         this.xb[39] = new int[this.yb];
      }

      int[] var2 = (int[])((int[])this.xb[48]);
      int[] var3 = (int[])((int[])this.xb[39]);
      int var4 = 0;

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      while(var4 < this.f_vb) {
         var5 = (this.f_cb[var4] - (this.f_pb[var4] * ((int[])((int[])this.xb[1]))[30] >> 8) >> ((int[])((int[])this.xb[1]))[9]) - ((int[])((int[])var1[1]))[0];
         var6 = (this.f_jb[var4] - (this.f_pb[var4] * ((int[])((int[])this.xb[1]))[31] >> 8) >> ((int[])((int[])this.xb[1]))[9]) - ((int[])((int[])var1[1]))[2];
         var7 = this.Gb[var4];
         var8 = this.Gb[var4 + 1];
         var9 = var7;

         while(true) {
            if(var9 < var8) {
               var10 = (this.N[var9] & '\uffff') - 1;
               if(var10 != -1) {
                  var2[var10] = var5;
                  var3[var10] = var6;
                  ++var9;
                  continue;
               }
            }

            ++var4;
            break;
         }
      }

      for(var4 = 0; var4 < this.f_db; ++var4) {
         if(this.f_kb == null || this.f_kb[var4] <= 128) {
            var5 = this.Bb[var4] & '\uffff';
            var6 = this.f_gb[var4] & '\uffff';
            var7 = this.M[var4] & '\uffff';
            var8 = var2[var5];
            var9 = var2[var6];
            var10 = var2[var7];
            int var11 = var3[var5];
            int var12 = var3[var6];
            int var13 = var3[var7];
            if((var8 - var9) * (var12 - var13) - (var12 - var11) * (var10 - var9) > 0) {
               uu.a(var9, var10, var12, var11, var13, (byte)71, var1, var8);
            }
         }
      }

   }

   private final void i() {
      if(this.f_db != 0) {
         if(this.B != 0) {
            this.a(true);
         }

         this.a(false);
         if(this.D != null) {
            if(this.D.a == null) {
               this.b((this.B & 16) != 0);
            }

            if(this.D.a != null) {
               pda.a(this.xb, -21342, this.f_nb != null);
               nqa.a(this.y, this.f_nb, 20798, this.z, this.xb, this.A);
               int var1 = this.Fb.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.Fb[var2];
                  int var4 = this.Fb[var2 + 1];
                  int var5 = this.Y[var3] & '\uffff';
                  if(var5 == '\uffff') {
                     var5 = -1;
                  }

                  kka.a(var5, (byte)124, this.f_nb != null, this.xb);
                  kna.a(4, this.D.a, (var4 - var3) * 3, this.xb, -127, var3 * 3);
               }
            }
         }

         this.g();
      }
   }

   final void UA(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_vb; ++var4) {
         int var5 = this.f_pb[var4] * var3 - this.f_jb[var4] * var2 >> 14;
         this.f_jb[var4] = this.f_pb[var4] * var2 + this.f_jb[var4] * var3 >> 14;
         this.f_pb[var4] = var5;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   final void DA(short var1, short var2) {
      Object[] var3 = this.xb;
      qa var4 = ((ta)(this.xb == null?null:var3[55])).k;

      for(int var5 = 0; var5 < this.H; ++var5) {
         if(this.Y[var5] == var1) {
            this.Y[var5] = var2;
         }
      }

      byte var12 = 0;
      byte var6 = 0;
      if(var1 != -1) {
         Object[] var7 = var4.a(var1 & '\uffff', (byte)39);
         var12 = ((byte[])((byte[])var7[0]))[3];
         var6 = ((byte[])((byte[])var7[0]))[1];
      }

      byte var13 = 0;
      byte var8 = 0;
      if(var2 != -1) {
         Object[] var9 = var4.a(var2 & '\uffff', (byte)106);
         var13 = ((byte[])((byte[])var9[0]))[3];
         var8 = ((byte[])((byte[])var9[0]))[1];
         if(((byte[])((byte[])var9[0]))[5] != 0 || ((byte[])((byte[])var9[0]))[6] != 0) {
            this.U = true;
         }
      }

      if(var12 != var13 | var6 != var8) {
         if(this.f_ub != null) {
            for(int var14 = 0; var14 < this.F; ++var14) {
               Object[] var10 = this.f_ub[var14];
               Object[] var11 = this.G[var14];
               ((int[])((int[])var11[0]))[0] = ((int[])((int[])var11[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var10[1]))[4]] & '\uffff'] & 16777215;
            }
         }

         if(this.A != null) {
            this.A[2] = null;
         }
      }

   }

   final void G(int var1) {
      this.r = var1;
      if(this.v != null && (this.r & 65536) == 0) {
         this.f_qb = this.v.d;
         this.Z = this.v.c;
         this.u = this.v.b;
         this.p = this.v.a;
         this.v = null;
      }

      this.E = true;
      this.g();
   }

   final void a(Object[] var1, int var2, boolean var3) {
      if(this.Cb != null) {
         Object[] var4 = var1;
         if(var3) {
            var4 = (Object[])((Object[])this.xb[37]);
            sea.a(var1, true, var4);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.f_vb; ++var6) {
            if((var2 & this.Cb[var6]) != 0) {
               pl.a(var4, (float)this.f_cb[var6], (float)this.f_pb[var6], (float)this.f_jb[var6], 7, var5);
               this.f_cb[var6] = (int)var5[0];
               this.f_pb[var6] = (int)var5[1];
               this.f_jb[var6] = (int)var5[2];
            }
         }

      }
   }

   final void O(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_vb; ++var4) {
         int var5 = this.f_jb[var4] * var2 + this.f_cb[var4] * var3 >> 14;
         this.f_jb[var4] = this.f_jb[var4] * var3 - this.f_cb[var4] * var2 >> 14;
         this.f_cb[var4] = var5;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   private final void b(boolean var1) {
      if(((byte[])((byte[])((Object[])((Object[])this.xb[54]))[2])).length < this.f_db * 6) {
         this.xb[54] = jaa.a(new Object[3], (this.f_db + 100) * 6, false);
      } else {
         ((int[])((int[])((Object[])((Object[])this.xb[54]))[1]))[0] = 0;
      }

      Object[] var2 = (Object[])((Object[])this.xb[54]);
      int var3;
      if(((boolean[])((boolean[])this.xb[17]))[11]) {
         for(var3 = 0; var3 < this.f_db; ++var3) {
            eda.putShort(var2, this.Bb[var3]);
            eda.putShort(var2, this.f_gb[var3]);
            eda.putShort(var2, this.M[var3]);
         }
      } else {
         for(var3 = 0; var3 < this.f_db; ++var3) {
            nua.a(var2, 1, this.Bb[var3]);
            nua.a(var2, 1, this.f_gb[var3]);
            nua.a(var2, 1, this.M[var3]);
         }
      }

      if(((int[])((int[])var2[1]))[0] != 0) {
         if(var1) {
            if(this.q == null) {
               this.q = bqa.a((byte[])((byte[])var2[2]), 3, this.xb, 5123, ((int[])((int[])var2[1]))[0], true);
            } else {
               Object[] var6 = this.q;
               byte[] var4 = (byte[])((byte[])var2[2]);
               int var5 = ((int[])((int[])var2[1]))[0];
               if(null != var6 && var6.length == 6) {
                  vta.a(var4, (byte)-125, 5123, var6, var5);
               } else {
                  if(null == var6 || -2 != ~var6.length) {
                     throw new IllegalStateException();
                  }

                  cma.a(5123, var4, (byte)116, var5, var6);
               }
            }

            this.D.a = this.q;
         } else {
            this.D.a = bqa.a((byte[])((byte[])var2[2]), 3, this.xb, 5123, ((int[])((int[])var2[1]))[0], false);
         }

         if(!var1) {
            this.E = true;
         }

      }
   }

   private static final float[] a(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final void EA(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.f_vb; ++var4) {
         var5 = this.f_jb[var4] * var2 + this.f_cb[var4] * var3 >> 14;
         this.f_jb[var4] = this.f_jb[var4] * var3 - this.f_cb[var4] * var2 >> 14;
         this.f_cb[var4] = var5;
      }

      for(var4 = 0; var4 < this.yb; ++var4) {
         var5 = this.u[var4] * var2 + this.f_qb[var4] * var3 >> 14;
         this.u[var4] = (short)(this.u[var4] * var3 - this.f_qb[var4] * var2 >> 14);
         this.f_qb[var4] = (short)var5;
      }

      if(this.f_nb == null && this.A != null) {
         this.A[2] = null;
      }

      if(this.f_nb != null) {
         this.f_nb[2] = null;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   private final short a(ii var1, int var2, long var3, int var5, int var6, int var7, int var8, float var9, float var10) {
      int var11 = this.Gb[var2];
      int var12 = this.Gb[var2 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         short var15 = this.N[var14];
         if(var15 == 0) {
            var13 = var14;
            break;
         }

         if(t[var14] == var3) {
            return (short)(var15 - 1);
         }
      }

      this.N[var13] = (short)(this.yb + 1);
      t[var13] = var3;
      this.f_qb[this.yb] = (short)var5;
      this.Z[this.yb] = (short)var6;
      this.u[this.yb] = (short)var7;
      this.p[this.yb] = (byte)var8;
      this.P[this.yb] = var9;
      this.s[this.yb] = var10;
      return (short)(this.yb++);
   }

   final void a(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.H; ++var5) {
         int var6 = this.Ab[var5] & '\uffff';
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

         this.Ab[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.f_ub != null) {
         for(var5 = 0; var5 < this.F; ++var5) {
            Object[] var10 = this.f_ub[var5];
            Object[] var11 = this.G[var5];
            ((int[])((int[])var11[0]))[0] = ((int[])((int[])var11[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var10[1]))[4]] & '\uffff'] & 16777215;
         }
      }

      if(this.A != null) {
         this.A[2] = null;
      }

   }

   final void e() {}

   private final int a(int var1, short var2, int var3, byte var4) {
      int var6 = tpa.f[a(var1, var3)];
      if(var2 != -1) {
         Object[] var5 = this.xb;
         Object[] var7 = ((ta)(this.xb == null?null:var5[55])).k.a(var2 & '\uffff', (byte)125);
         int var8 = ((byte[])((byte[])var7[0]))[3] & 255;
         int var9;
         int var11;
         if(var8 != 0) {
            if(var3 < 0) {
               var9 = 0;
            } else if(var3 > 127) {
               var9 = 16777215;
            } else {
               var9 = 131586 * var3;
            }

            if(var8 == 256) {
               var6 = var9;
            } else {
               var11 = 256 - var8;
               var6 = ((var9 & 16711935) * var8 + (var6 & 16711935) * var11 & -16711936) + ((var9 & '\uff00') * var8 + (var6 & '\uff00') * var11 & 16711680) >> 8;
            }
         }

         var9 = ((byte[])((byte[])var7[0]))[1] & 255;
         if(var9 != 0) {
            var9 += 256;
            int var10 = ((var6 & 16711680) >> 16) * var9;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var11 = ((var6 & '\uff00') >> 8) * var9;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            int var12 = (var6 & 255) * var9;
            if(var12 > '\uffff') {
               var12 = '\uffff';
            }

            var6 = (var10 << 8 & 16711680) + (var11 & '\uff00') + (var12 >> 8);
         }
      }

      return var6 << 8 | 255 - (var4 & 255);
   }

   private final void g() {
      if(this.E) {
         this.E = false;
         boolean var1;
         int var2;
         boolean var4;
         boolean var5;
         boolean var6;
         if(this.f_bb == null && this.f_eb == null && this.f_ub == null) {
            var2 = this.r;
            var1 = (var2 & 55) != 0;
            if(!var1) {
               boolean var3 = false;
               var4 = false;
               var5 = false;
               int var7;
               int var8;
               if(this.f_cb != null) {
                  var7 = this.r;
                  var8 = this.K;
                  boolean var9 = (var7 & 458752) != 0;
                  boolean var10 = 0 != (33 & var7);
                  var6 = var9 | var10 || wca.a(var8, -62, var7);
                  if(!var6) {
                     if(this.y != null && this.y[2] == null) {
                        this.E = true;
                     } else {
                        if(!this.O) {
                           this.h();
                        }

                        var3 = true;
                     }
                  }
               }

               if(this.f_pb != null) {
                  var7 = this.r;
                  var8 = this.K;
                  var6 = (var7 & 458752) != 0 | isa.a(0, var8, var7) || wca.a(var8, -126, var7);
                  if(!var6) {
                     if(this.y != null && this.y[2] == null) {
                        this.E = true;
                     } else {
                        if(!this.O) {
                           this.h();
                        }

                        var4 = true;
                     }
                  }
               }

               if(this.f_jb != null) {
                  var7 = this.r;
                  var8 = this.K;
                  var6 = 0 != (458752 & var7) | uma.b((byte)66, var7, var8) || wca.a(var8, -88, var7);
                  if(!var6) {
                     if(this.y != null && this.y[2] == null) {
                        this.E = true;
                     } else {
                        if(!this.O) {
                           this.h();
                        }

                        var5 = true;
                     }
                  }
               }

               if(var3) {
                  this.f_cb = null;
               }

               if(var4) {
                  this.f_pb = null;
               }

               if(var5) {
                  this.f_jb = null;
               }
            }
         }

         if(this.N != null && this.f_cb == null && this.f_pb == null && this.f_jb == null) {
            this.N = null;
            this.Gb = null;
         }

         if(this.p != null && !sra.a(this.r, 55, this.K)) {
            if(this.f_nb != null) {
               if(this.f_nb[2] != null) {
                  this.u = null;
                  this.Z = null;
                  this.f_qb = null;
                  this.p = null;
               } else {
                  this.E = true;
               }
            } else if(this.A != null && this.A[2] == null) {
               this.E = true;
            } else {
               this.u = null;
               this.Z = null;
               this.f_qb = null;
               this.p = null;
            }
         }

         if(this.Ab != null && !uqa.a(this.K, (byte)71, this.r)) {
            if(this.A != null && this.A[2] == null) {
               this.E = true;
            } else {
               this.Ab = null;
            }
         }

         int var11;
         if(this.f_kb != null) {
            var2 = this.r;
            var11 = this.K;
            var4 = -1 != ~(262144 & var2);
            var5 = 0 != (var2 & 1048832);
            var1 = var5 | var4 || ev.a(var2, true, var11);
            if(!var1) {
               if(this.A != null && this.A[2] == null) {
                  this.E = true;
               } else {
                  this.f_kb = null;
               }
            }
         }

         if(this.P != null && !hp.a(this.K, -97, this.r)) {
            if(this.z != null && this.z[2] == null) {
               this.E = true;
            } else {
               this.s = null;
               this.P = null;
            }
         }

         if(this.Y != null && !as.a(0, this.r, this.K)) {
            if(this.A != null && this.A[2] == null) {
               this.E = true;
            } else {
               this.Y = null;
            }
         }

         if(this.Bb != null) {
            var2 = this.r;
            var11 = this.K;
            var4 = (var2 & 393216) != 0;
            var5 = 0 != (16 & var2);
            var6 = var4 | var5 || ev.a(var2, true, var11);
            if(!var6) {
               boolean var13 = (16 & var2) != 0;
               boolean var12 = bna.a(var2, 108, var11) & var13;
               var6 = var12;
            }

            if(!var6) {
               if((this.D == null || this.D.a != null) && (this.A == null || this.A[2] != null)) {
                  this.M = null;
                  this.f_gb = null;
                  this.Bb = null;
               } else {
                  this.E = true;
               }
            }
         }

         if(this.Eb != null) {
            var2 = this.r;
            var1 = (384 & var2) != 0;
            if(!var1) {
               this.Eb = (int[][])null;
               this.f_hb = null;
            }
         }

         if(this.Hb != null && !sna.a(104, this.K, this.r)) {
            this.Hb = (int[][])null;
            this.Cb = null;
         }

         if(this.f_ab != null && !eaa.a(100, this.K, this.r)) {
            this.f_ab = (int[][])null;
         }

         if(this.Fb != null && (this.r & 2048) == 0 && (this.r & 262144) == 0) {
            this.Fb = null;
         }

      }
   }

   final int pa() {
      if(!this.O) {
         this.h();
      }

      return this.L;
   }

   final int ga() {
      return this.W;
   }

   final byte[] B() {
      return this.f_kb;
   }

   final void i(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var50;
      int var49;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         I = 0;
         f_lb = 0;
         f_fb = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var50 = var2[var11];
            if(var50 < this.Hb.length) {
               int[] var52 = this.Hb[var50];

               for(var49 = 0; var49 < var52.length; ++var49) {
                  var15 = var52[var49];
                  if(this.Cb == null || (var7 & this.Cb[var15]) != 0) {
                     I += this.f_cb[var15];
                     f_lb += this.f_pb[var15];
                     f_fb += this.f_jb[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            I = I / var10 + var3;
            f_lb = f_lb / var10 + var4;
            f_fb = f_fb / var10 + var5;
            R = true;
         } else {
            I = var3;
            f_lb = var4;
            f_fb = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var50 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var50;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.Hb.length) {
                  var12 = this.Hb[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var49 = var12[var13];
                     if(this.Cb == null || (var7 & this.Cb[var49]) != 0) {
                        this.f_cb[var49] += var3;
                        this.f_pb[var49] += var4;
                        this.f_jb[var49] += var5;
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
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(R) {
                     var16 = var8[0] * I + var8[3] * f_lb + var8[6] * f_fb + 8192 >> 14;
                     var17 = var8[1] * I + var8[4] * f_lb + var8[7] * f_fb + 8192 >> 14;
                     var18 = var8[2] * I + var8[5] * f_lb + var8[8] * f_fb + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     I = var16;
                     f_lb = var17;
                     f_fb = var18;
                     R = false;
                  }

                  int[] var51 = new int[9];
                  var17 = tda.k[var3];
                  var18 = tda.p[var3];
                  var19 = tda.k[var4];
                  var20 = tda.p[var4];
                  var21 = tda.k[var5];
                  var22 = tda.p[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -I + var51[1] * -f_lb + var51[2] * -f_fb + 8192 >> 14;
                  var26 = var51[3] * -I + var51[4] * -f_lb + var51[5] * -f_fb + 8192 >> 14;
                  var27 = var51[6] * -I + var51[7] * -f_lb + var51[8] * -f_fb + 8192 >> 14;
                  var28 = var53 + I;
                  int var54 = var26 + f_lb;
                  var30 = var27 + f_fb;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var49 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var49 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var49 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var50;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.Hb.length) {
                        int[] var41 = this.Hb[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.Cb == null || (var7 & this.Cb[var43]) != 0) {
                              int var44 = var35[0] * this.f_cb[var43] + var35[1] * this.f_pb[var43] + var35[2] * this.f_jb[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.f_cb[var43] + var35[4] * this.f_pb[var43] + var35[5] * this.f_jb[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.f_cb[var43] + var35[7] * this.f_pb[var43] + var35[8] * this.f_jb[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.f_cb[var43] = var44;
                              this.f_pb[var43] = var45;
                              this.f_jb[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.Hb.length) {
                        var12 = this.Hb[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.Cb == null || (var7 & this.Cb[var49]) != 0) {
                              this.f_cb[var49] -= I;
                              this.f_pb[var49] -= f_lb;
                              this.f_jb[var49] -= f_fb;
                              if(var5 != 0) {
                                 var15 = tda.p[var5];
                                 var16 = tda.k[var5];
                                 var17 = this.f_pb[var49] * var15 + this.f_cb[var49] * var16 + 16383 >> 14;
                                 this.f_pb[var49] = this.f_pb[var49] * var16 - this.f_cb[var49] * var15 + 16383 >> 14;
                                 this.f_cb[var49] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = tda.p[var3];
                                 var16 = tda.k[var3];
                                 var17 = this.f_pb[var49] * var16 - this.f_jb[var49] * var15 + 16383 >> 14;
                                 this.f_jb[var49] = this.f_pb[var49] * var15 + this.f_jb[var49] * var16 + 16383 >> 14;
                                 this.f_pb[var49] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = tda.p[var4];
                                 var16 = tda.k[var4];
                                 var17 = this.f_jb[var49] * var15 + this.f_cb[var49] * var16 + 16383 >> 14;
                                 this.f_jb[var49] = this.f_jb[var49] * var16 - this.f_cb[var49] * var15 + 16383 >> 14;
                                 this.f_cb[var49] = var17;
                              }

                              this.f_cb[var49] += I;
                              this.f_pb[var49] += f_lb;
                              this.f_jb[var49] += f_fb;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.Hb.length) {
                           var12 = this.Hb[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.Cb == null || (var7 & this.Cb[var49]) != 0) {
                                 var15 = this.Gb[var49];
                                 var16 = this.Gb[var49 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.N[var17] - 1;
                                    if(var18 == -1) {
                                       break;
                                    }

                                    if(var5 != 0) {
                                       var19 = tda.p[var5];
                                       var20 = tda.k[var5];
                                       var21 = this.Z[var18] * var19 + this.f_qb[var18] * var20 + 16383 >> 14;
                                       this.Z[var18] = (short)(this.Z[var18] * var20 - this.f_qb[var18] * var19 + 16383 >> 14);
                                       this.f_qb[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = tda.p[var3];
                                       var20 = tda.k[var3];
                                       var21 = this.Z[var18] * var20 - this.u[var18] * var19 + 16383 >> 14;
                                       this.u[var18] = (short)(this.Z[var18] * var19 + this.u[var18] * var20 + 16383 >> 14);
                                       this.Z[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = tda.p[var4];
                                       var20 = tda.k[var4];
                                       var21 = this.u[var18] * var19 + this.f_qb[var18] * var20 + 16383 >> 14;
                                       this.u[var18] = (short)(this.u[var18] * var20 - this.f_qb[var18] * var19 + 16383 >> 14);
                                       this.f_qb[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.f_nb == null && this.A != null) {
                        this.A[2] = null;
                     }

                     if(this.f_nb != null) {
                        this.f_nb[2] = null;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(R) {
                     var16 = var8[0] * I + var8[3] * f_lb + var8[6] * f_fb + 8192 >> 14;
                     var17 = var8[1] * I + var8[4] * f_lb + var8[7] * f_fb + 8192 >> 14;
                     var18 = var8[2] * I + var8[5] * f_lb + var8[8] * f_fb + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     I = var16;
                     f_lb = var17;
                     f_fb = var18;
                     R = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -I + 8192 >> 14;
                  var20 = var17 * -f_lb + 8192 >> 14;
                  var21 = var18 * -f_fb + 8192 >> 14;
                  var22 = var19 + I;
                  var23 = var20 + f_lb;
                  var24 = var21 + f_fb;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var49 + 8192 >> 14;
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
                  var32 += var50;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.Hb.length) {
                        var35 = this.Hb[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.Cb == null || (var7 & this.Cb[var37]) != 0) {
                              var38 = var29[0] * this.f_cb[var37] + var29[1] * this.f_pb[var37] + var29[2] * this.f_jb[var37] + 8192 >> 14;
                              var39 = var29[3] * this.f_cb[var37] + var29[4] * this.f_pb[var37] + var29[5] * this.f_jb[var37] + 8192 >> 14;
                              var40 = var29[6] * this.f_cb[var37] + var29[7] * this.f_pb[var37] + var29[8] * this.f_jb[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.f_cb[var37] = var38;
                              this.f_pb[var37] = var39;
                              this.f_jb[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.Hb.length) {
                        var12 = this.Hb[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.Cb == null || (var7 & this.Cb[var49]) != 0) {
                              this.f_cb[var49] -= I;
                              this.f_pb[var49] -= f_lb;
                              this.f_jb[var49] -= f_fb;
                              this.f_cb[var49] = this.f_cb[var49] * var3 >> 7;
                              this.f_pb[var49] = this.f_pb[var49] * var4 >> 7;
                              this.f_jb[var49] = this.f_jb[var49] * var5 >> 7;
                              this.f_cb[var49] += I;
                              this.f_pb[var49] += f_lb;
                              this.f_jb[var49] += f_fb;
                           }
                        }
                     }
                  }
               }

            } else {
               Object[] var47;
               Object[] var48;
               if(var1 == 5) {
                  if(this.Eb != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.Eb.length) {
                           var12 = this.Eb[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.f_hb == null || (var7 & this.f_hb[var49]) != 0) {
                                 var15 = (this.f_kb[var49] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.f_kb[var49] = (byte)var15;
                                 if(this.A != null) {
                                    this.A[2] = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.f_ub != null) {
                        for(var10 = 0; var10 < this.F; ++var10) {
                           var47 = this.f_ub[var10];
                           var48 = this.G[var10];
                           ((int[])((int[])var48[0]))[0] = ((int[])((int[])var48[0]))[0] & 16777215 | 255 - (this.f_kb[((int[])((int[])var47[1]))[4]] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.Eb != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.Eb.length) {
                           var12 = this.Eb[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.f_hb == null || (var7 & this.f_hb[var49]) != 0) {
                                 var15 = this.Ab[var49] & '\uffff';
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

                                 this.Ab[var49] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if(this.A != null) {
                                    this.A[2] = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.f_ub != null) {
                        for(var10 = 0; var10 < this.F; ++var10) {
                           var47 = this.f_ub[var10];
                           var48 = this.G[var10];
                           ((int[])((int[])var48[0]))[0] = ((int[])((int[])var48[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var47[1]))[4]] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Object[] var14;
                  if(var1 == 8) {
                     if(this.f_ab != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.f_ab.length) {
                              var12 = this.f_ab[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.G[var12[var13]];
                                 ((int[])((int[])var14[0]))[5] += var3;
                                 ((int[])((int[])var14[0]))[3] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.f_ab != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.f_ab.length) {
                              var12 = this.f_ab[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.G[var12[var13]];
                                 ((int[])((int[])var14[0]))[2] = ((int[])((int[])var14[0]))[2] * var3 >> 7;
                                 ((int[])((int[])var14[0]))[4] = ((int[])((int[])var14[0]))[4] * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.f_ab != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.f_ab.length) {
                              var12 = this.f_ab[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.G[var12[var13]];
                                 ((int[])((int[])var14[0]))[1] = ((int[])((int[])var14[0]))[1] + var3 & 16383;
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

   final void I(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.H; ++var3) {
            this.f_kb[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.H; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.f_kb[var3] = (byte)var4;
         }
      }

      if(this.A != null) {
         this.A[2] = null;
      }

   }

   final int N() {
      if(!this.O) {
         this.h();
      }

      return this.C;
   }

   final ka a(byte var1, int var2, boolean var3) {
      boolean var6 = false;
      qna var4;
      qna var5;
      if(var1 > 0 && var1 <= 7) {
         var5 = ((qna[])((qna[])this.xb[9]))[var1 - 1];
         var4 = ((qna[])((qna[])this.xb[20]))[var1 - 1];
         var6 = true;
      } else {
         var4 = var5 = new qna(this.xb);
      }

      return this.a(var4, var5, var2, var6, var3);
   }

   final int D() {
      if(!this.O) {
         this.h();
      }

      return this.f_sb;
   }

   private final void a(boolean var1) {
      boolean var2 = this.A != null && this.A[2] == null;
      boolean var3 = this.f_nb != null && this.f_nb[2] == null;
      boolean var4 = this.y != null && this.y[2] == null;
      boolean var5 = this.z != null && this.z[2] == null;
      if(var1) {
         var2 &= (this.B & 2) != 0;
         var3 &= (this.B & 4) != 0;
         var4 &= (this.B & 1) != 0;
         var5 &= (this.B & 8) != 0;
      }

      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      if(var4) {
         var7 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var2) {
         var8 = var6;
         var6 = (byte)(var6 + 4);
      }

      if(var3) {
         var9 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var5) {
         var10 = var6;
         var6 = (byte)(var6 + 8);
      }

      if(var6 != 0) {
         if(((byte[])((byte[])((Object[])((Object[])this.xb[54]))[2])).length < this.yb * var6) {
            this.xb[54] = jaa.a(new Object[3], (this.yb + 100) * var6, false);
         } else {
            ((int[])((int[])((Object[])((Object[])this.xb[54]))[1]))[0] = 0;
         }

         Object[] var11 = (Object[])((Object[])this.xb[54]);
         int var12;
         int var13;
         int var19;
         int var18;
         if(var4) {
            int var14;
            int var15;
            int var17;
            int var16;
            if(((boolean[])((boolean[])this.xb[17]))[11]) {
               for(var12 = 0; var12 < this.f_vb; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.f_cb[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.f_pb[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.f_jb[var12]);
                  var16 = this.Gb[var12];
                  var17 = this.Gb[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = this.N[var18] - 1;
                     if(var19 == -1) {
                        break;
                     }

                     ((int[])((int[])var11[1]))[0] = var19 * var6;
                     op.putInt(var11, var13);
                     op.putInt(var11, var14);
                     op.putInt(var11, var15);
                  }
               }
            } else {
               for(var12 = 0; var12 < this.f_vb; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.f_cb[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.f_pb[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.f_jb[var12]);
                  var16 = this.Gb[var12];
                  var17 = this.Gb[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = (this.N[var18] & '\uffff') - 1;
                     if(var19 == -1) {
                        break;
                     }

                     ((int[])((int[])var11[1]))[0] = var19 * var6;
                     mqa.putIntLE(var13, var11, -2);
                     mqa.putIntLE(var14, var11, -2);
                     mqa.putIntLE(var15, var11, -2);
                  }
               }
            }
         }

         float var20;
         short[] var34;
         short[] var35;
         byte[] var38;
         short[] var36;
         float var40;
         if(var2) {
            if(this.f_nb == null) {
               if(this.v != null) {
                  var35 = this.v.d;
                  var34 = this.v.c;
                  var36 = this.v.b;
                  var38 = this.v.a;
               } else {
                  var35 = this.f_qb;
                  var34 = this.Z;
                  var36 = this.u;
                  var38 = this.p;
               }

               float var27 = ((float[])((float[])this.xb[5]))[0];
               float var28 = ((float[])((float[])this.xb[5]))[1];
               float var29 = ((float[])((float[])this.xb[5]))[2];
               float var30 = ((float[])((float[])this.xb[25]))[10];
               float var31 = ((float[])((float[])this.xb[25]))[18] * 768.0F / (float)this.W;
               float var32 = ((float[])((float[])this.xb[25]))[16] * 768.0F / (float)this.W;

               for(int var33 = 0; var33 < this.H; ++var33) {
                  int var23 = this.a(this.Ab[var33], this.Y[var33], this.f_rb, this.f_kb[var33]);
                  float var43 = (float)(var23 >>> 24) * ((float[])((float[])this.xb[25]))[7];
                  var20 = (float)(var23 >> 16 & 255) * ((float[])((float[])this.xb[25]))[17];
                  float var21 = (float)(var23 >> 8 & 255) * ((float[])((float[])this.xb[25]))[15];
                  short var22 = this.Bb[var33];
                  short var37 = (short)var38[var22];
                  if(var37 == 0) {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) * 0.0026041667F;
                  } else {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) / (float)(var37 * 256);
                  }

                  float var41 = var30 + var40 * (var40 < 0.0F?var32:var31);
                  int var24 = (int)(var43 * var41);
                  if(var24 < 0) {
                     var24 = 0;
                  } else if(var24 > 255) {
                     var24 = 255;
                  }

                  int var25 = (int)(var20 * var41);
                  if(var25 < 0) {
                     var25 = 0;
                  } else if(var25 > 255) {
                     var25 = 255;
                  }

                  int var26 = (int)(var21 * var41);
                  if(var26 < 0) {
                     var26 = 0;
                  } else if(var26 > 255) {
                     var26 = 255;
                  }

                  ((int[])((int[])var11[1]))[0] = var8 + var22 * var6;
                  ek.putByte(var11, var24);
                  ek.putByte(var11, var25);
                  ek.putByte(var11, var26);
                  ek.putByte(var11, 255 - (this.f_kb[var33] & 255));
                  var22 = this.f_gb[var33];
                  var37 = (short)var38[var22];
                  if(var37 == 0) {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) * 0.0026041667F;
                  } else {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) / (float)(var37 * 256);
                  }

                  var41 = var30 + var40 * (var40 < 0.0F?var32:var31);
                  var24 = (int)(var43 * var41);
                  if(var24 < 0) {
                     var24 = 0;
                  } else if(var24 > 255) {
                     var24 = 255;
                  }

                  var25 = (int)(var20 * var41);
                  if(var25 < 0) {
                     var25 = 0;
                  } else if(var25 > 255) {
                     var25 = 255;
                  }

                  var26 = (int)(var21 * var41);
                  if(var26 < 0) {
                     var26 = 0;
                  } else if(var26 > 255) {
                     var26 = 255;
                  }

                  ((int[])((int[])var11[1]))[0] = var8 + var22 * var6;
                  ek.putByte(var11, var24);
                  ek.putByte(var11, var25);
                  ek.putByte(var11, var26);
                  ek.putByte(var11, 255 - (this.f_kb[var33] & 255));
                  var22 = this.M[var33];
                  var37 = (short)var38[var22];
                  if(var37 == 0) {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) * 0.0026041667F;
                  } else {
                     var40 = (var27 * (float)var35[var22] + var28 * (float)var34[var22] + var29 * (float)var36[var22]) / (float)(var37 * 256);
                  }

                  var41 = var30 + var40 * (var40 < 0.0F?var32:var31);
                  var24 = (int)(var43 * var41);
                  if(var24 < 0) {
                     var24 = 0;
                  } else if(var24 > 255) {
                     var24 = 255;
                  }

                  var25 = (int)(var20 * var41);
                  if(var25 < 0) {
                     var25 = 0;
                  } else if(var25 > 255) {
                     var25 = 255;
                  }

                  var26 = (int)(var21 * var41);
                  if(var26 < 0) {
                     var26 = 0;
                  } else if(var26 > 255) {
                     var26 = 255;
                  }

                  ((int[])((int[])var11[1]))[0] = var8 + var22 * var6;
                  ek.putByte(var11, var24);
                  ek.putByte(var11, var25);
                  ek.putByte(var11, var26);
                  ek.putByte(var11, 255 - (this.f_kb[var33] & 255));
               }
            } else {
               for(var12 = 0; var12 < this.H; ++var12) {
                  var13 = this.a(this.Ab[var12], this.Y[var12], this.f_rb, this.f_kb[var12]);
                  ((int[])((int[])var11[1]))[0] = var8 + (this.Bb[var12] & '\uffff') * var6;
                  op.putInt(var11, var13);
                  ((int[])((int[])var11[1]))[0] = var8 + (this.f_gb[var12] & '\uffff') * var6;
                  op.putInt(var11, var13);
                  ((int[])((int[])var11[1]))[0] = var8 + (this.M[var12] & '\uffff') * var6;
                  op.putInt(var11, var13);
               }
            }
         }

         if(var3) {
            if(this.v != null) {
               var35 = this.v.d;
               var34 = this.v.c;
               var36 = this.v.b;
               var38 = this.v.a;
            } else {
               var35 = this.f_qb;
               var34 = this.Z;
               var36 = this.u;
               var38 = this.p;
            }

            float var39 = 3.0F / (float)this.W;
            var40 = 3.0F / (float)(this.W + this.W / 2);
            ((int[])((int[])var11[1]))[0] = var9;
            if(((boolean[])((boolean[])this.xb[17]))[11]) {
               for(var18 = 0; var18 < this.yb; ++var18) {
                  var19 = var38[var18] & 255;
                  if(var19 == 0) {
                     tua.putFloat(var11, (byte)-126, (float)var35[var18] * var40);
                     tua.putFloat(var11, (byte)-126, (float)var34[var18] * var40);
                     tua.putFloat(var11, (byte)-127, (float)var36[var18] * var40);
                  } else {
                     var20 = var39 / (float)var19;
                     tua.putFloat(var11, (byte)-128, (float)var35[var18] * var20);
                     tua.putFloat(var11, (byte)-126, (float)var34[var18] * var20);
                     tua.putFloat(var11, (byte)-127, (float)var36[var18] * var20);
                  }

                  ((int[])((int[])var11[1]))[0] += var6 - 12;
               }
            } else {
               for(var18 = 0; var18 < this.yb; ++var18) {
                  var19 = var38[var18] & 255;
                  if(var19 == 0) {
                     uq.putFloatLE(1, (float)var35[var18] * var40, var11);
                     uq.putFloatLE(1, (float)var34[var18] * var40, var11);
                     uq.putFloatLE(1, (float)var36[var18] * var40, var11);
                  } else {
                     var20 = var39 / (float)var19;
                     uq.putFloatLE(1, (float)var35[var18] * var20, var11);
                     uq.putFloatLE(1, (float)var34[var18] * var20, var11);
                     uq.putFloatLE(1, (float)var36[var18] * var20, var11);
                  }

                  ((int[])((int[])var11[1]))[0] += var6 - 12;
               }
            }
         }

         if(var5) {
            ((int[])((int[])var11[1]))[0] = var10;
            if(((boolean[])((boolean[])this.xb[17]))[11]) {
               for(var12 = 0; var12 < this.yb; ++var12) {
                  tua.putFloat(var11, (byte)-126, this.P[var12]);
                  tua.putFloat(var11, (byte)-126, this.s[var12]);
                  ((int[])((int[])var11[1]))[0] += var6 - 8;
               }
            } else {
               for(var12 = 0; var12 < this.yb; ++var12) {
                  uq.putFloatLE(1, this.P[var12], var11);
                  uq.putFloatLE(1, this.s[var12], var11);
                  ((int[])((int[])var11[1]))[0] += var6 - 8;
               }
            }
         }

         ((int[])((int[])var11[1]))[0] = var6 * this.yb;
         Object[] var42;
         if(var1) {
            if(this.T == null) {
               this.T = hq.a(this.xb, ((int[])((int[])var11[1]))[0], true, var6, (byte[])((byte[])var11[2]), false);
            } else {
               ci.a(-108, var6, this.T, (byte[])((byte[])var11[2]), ((int[])((int[])var11[1]))[0]);
            }

            var42 = this.T;
            this.B = 0;
         } else {
            var42 = hq.a(this.xb, ((int[])((int[])var11[1]))[0], false, var6, (byte[])((byte[])var11[2]), false);
            this.E = true;
         }

         if(var4) {
            this.y[2] = var42;
            ((byte[])((byte[])this.y[1]))[1] = var7;
         }

         if(var5) {
            this.z[2] = var42;
            ((byte[])((byte[])this.z[1]))[1] = var10;
         }

         if(var2) {
            this.A[2] = var42;
            ((byte[])((byte[])this.A[1]))[1] = var8;
         }

         if(var3) {
            this.f_nb[2] = var42;
            ((byte[])((byte[])this.f_nb[1]))[1] = var9;
         }

      }
   }

   private static final byte[] a(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         I = 0;
         f_lb = 0;
         f_fb = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.Hb.length) {
               int[] var25 = this.Hb[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  I += this.f_cb[var14];
                  f_lb += this.f_pb[var14];
                  f_fb += this.f_jb[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            I = I / var9 + var3;
            f_lb = f_lb / var9 + var4;
            f_fb = f_fb / var9 + var5;
         } else {
            I = var3;
            f_lb = var4;
            f_fb = var5;
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
               if(var10 < this.Hb.length) {
                  var11 = this.Hb[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.f_cb[var23] += var3;
                     this.f_pb[var23] += var4;
                     this.f_jb[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var17;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.Hb.length) {
                     var11 = this.Hb[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.f_cb[var23] -= I;
                           this.f_pb[var23] -= f_lb;
                           this.f_jb[var23] -= f_fb;
                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.f_pb[var23] * var14 + this.f_cb[var23] * var15 + 16383 >> 14;
                              this.f_pb[var23] = this.f_pb[var23] * var15 - this.f_cb[var23] * var14 + 16383 >> 14;
                              this.f_cb[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.f_pb[var23] * var15 - this.f_jb[var23] * var14 + 16383 >> 14;
                              this.f_jb[var23] = this.f_pb[var23] * var14 + this.f_jb[var23] * var15 + 16383 >> 14;
                              this.f_pb[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.f_jb[var23] * var14 + this.f_cb[var23] * var15 + 16383 >> 14;
                              this.f_jb[var23] = this.f_jb[var23] * var15 - this.f_cb[var23] * var14 + 16383 >> 14;
                              this.f_cb[var23] = var16;
                           }

                           this.f_cb[var23] += I;
                           this.f_pb[var23] += f_lb;
                           this.f_jb[var23] += f_fb;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.f_cb[var23] -= I;
                           this.f_pb[var23] -= f_lb;
                           this.f_jb[var23] -= f_fb;
                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.f_pb[var23] * var15 - this.f_jb[var23] * var14 + 16383 >> 14;
                              this.f_jb[var23] = this.f_pb[var23] * var14 + this.f_jb[var23] * var15 + 16383 >> 14;
                              this.f_pb[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.f_pb[var23] * var14 + this.f_cb[var23] * var15 + 16383 >> 14;
                              this.f_pb[var23] = this.f_pb[var23] * var15 - this.f_cb[var23] * var14 + 16383 >> 14;
                              this.f_cb[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.f_jb[var23] * var14 + this.f_cb[var23] * var15 + 16383 >> 14;
                              this.f_jb[var23] = this.f_jb[var23] * var15 - this.f_cb[var23] * var14 + 16383 >> 14;
                              this.f_cb[var23] = var16;
                           }

                           this.f_cb[var23] += I;
                           this.f_pb[var23] += f_lb;
                           this.f_jb[var23] += f_fb;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.Hb.length) {
                        var11 = this.Hb[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.Gb[var23];
                           var15 = this.Gb[var23 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.N[var16] - 1;
                              if(var17 == -1) {
                                 break;
                              }

                              int var19;
                              int var18;
                              int var20;
                              if(var5 != 0) {
                                 var18 = tda.p[var5];
                                 var19 = tda.k[var5];
                                 var20 = this.Z[var17] * var18 + this.f_qb[var17] * var19 + 16383 >> 14;
                                 this.Z[var17] = (short)(this.Z[var17] * var19 - this.f_qb[var17] * var18 + 16383 >> 14);
                                 this.f_qb[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = tda.p[var3];
                                 var19 = tda.k[var3];
                                 var20 = this.Z[var17] * var19 - this.u[var17] * var18 + 16383 >> 14;
                                 this.u[var17] = (short)(this.Z[var17] * var18 + this.u[var17] * var19 + 16383 >> 14);
                                 this.Z[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = tda.p[var4];
                                 var19 = tda.k[var4];
                                 var20 = this.u[var17] * var18 + this.f_qb[var17] * var19 + 16383 >> 14;
                                 this.u[var17] = (short)(this.u[var17] * var19 - this.f_qb[var17] * var18 + 16383 >> 14);
                                 this.f_qb[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.f_nb == null && this.A != null) {
                     this.A[2] = null;
                  }

                  if(this.f_nb != null) {
                     this.f_nb[2] = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.Hb.length) {
                     var11 = this.Hb[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.f_cb[var23] -= I;
                        this.f_pb[var23] -= f_lb;
                        this.f_jb[var23] -= f_fb;
                        this.f_cb[var23] = this.f_cb[var23] * var3 >> 7;
                        this.f_pb[var23] = this.f_pb[var23] * var4 >> 7;
                        this.f_jb[var23] = this.f_jb[var23] * var5 >> 7;
                        this.f_cb[var23] += I;
                        this.f_pb[var23] += f_lb;
                        this.f_jb[var23] += f_fb;
                     }
                  }
               }

            } else {
               Object[] var21;
               Object[] var22;
               if(var1 == 5) {
                  if(this.Eb != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.Eb.length) {
                           var11 = this.Eb[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.f_kb[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.f_kb[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.A != null) {
                              this.A[2] = null;
                           }
                        }
                     }

                     if(this.f_ub != null) {
                        for(var9 = 0; var9 < this.F; ++var9) {
                           var21 = this.f_ub[var9];
                           var22 = this.G[var9];
                           ((int[])((int[])var22[0]))[0] = ((int[])((int[])var22[0]))[0] & 16777215 | 255 - (this.f_kb[((int[])((int[])var21[1]))[4]] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.Eb != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.Eb.length) {
                           var11 = this.Eb[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.Ab[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.Ab[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.A != null) {
                              this.A[2] = null;
                           }
                        }
                     }

                     if(this.f_ub != null) {
                        for(var9 = 0; var9 < this.F; ++var9) {
                           var21 = this.f_ub[var9];
                           var22 = this.G[var9];
                           ((int[])((int[])var22[0]))[0] = ((int[])((int[])var22[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var21[1]))[4]] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Object[] var13;
                  if(var1 == 8) {
                     if(this.f_ab != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.f_ab.length) {
                              var11 = this.f_ab[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.G[var11[var12]];
                                 ((int[])((int[])var13[0]))[5] += var3;
                                 ((int[])((int[])var13[0]))[3] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.f_ab != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.f_ab.length) {
                              var11 = this.f_ab[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.G[var11[var12]];
                                 ((int[])((int[])var13[0]))[2] = ((int[])((int[])var13[0]))[2] * var3 >> 7;
                                 ((int[])((int[])var13[0]))[4] = ((int[])((int[])var13[0]))[4] * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.f_ab != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.f_ab.length) {
                              var11 = this.f_ab[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.G[var11[var12]];
                                 ((int[])((int[])var13[0]))[1] = ((int[])((int[])var13[0]))[1] + var3 & 16383;
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

   final void ta(int var1, int var2, aa var3, aa var4, int var5, int var6, int var7) {
      if(!this.O) {
         this.h();
      }

      int var8 = var5 + this.Q;
      int var9 = var5 + this.f_ob;
      int var10 = var7 + this.X;
      int var11 = var7 + this.f_sb;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.g >> var3.a < var3.f_i && var10 >= 0 && var11 + var3.g >> var3.a < var3.h) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.a;
            var9 = var9 + (var3.g - 1) >> var3.a;
            var10 >>= var3.a;
            var11 = var11 + (var3.g - 1) >> var3.a;
            if(var3.b(-80, var10, var8) == var6 && var3.b(-111, var10, var9) == var6 && var3.b(-36, var11, var8) == var6 && var3.b(-69, var11, var9) == var6) {
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
            for(var12 = 0; var12 < this.f_vb; ++var12) {
               this.f_pb[var12] = this.f_pb[var12] + var3.a(1, this.f_cb[var12] + var5, this.f_jb[var12] + var7) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               short var19 = this.L;
               if(var19 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.f_vb; ++var13) {
                  var14 = (this.f_pb[var13] << 16) / var19;
                  if(var14 < var2) {
                     this.f_pb[var13] += (var3.a(1, this.f_cb[var13] + var5, this.f_jb[var13] + var7) - var6) * (var2 - var14) / var2;
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
                  var12 = this.C - this.L;

                  for(var13 = 0; var13 < this.f_vb; ++var13) {
                     this.f_pb[var13] = this.f_pb[var13] + (var4.a(1, this.f_cb[var13] + var5, this.f_jb[var13] + var7) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.C - this.L;

                  for(var13 = 0; var13 < this.f_vb; ++var13) {
                     var14 = this.f_cb[var13] + var5;
                     var15 = this.f_jb[var13] + var7;
                     int var16 = var3.a(1, var14, var15);
                     int var17 = var4.a(1, var14, var15);
                     int var18 = var16 - var17 - var2;
                     this.f_pb[var13] = ((this.f_pb[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         if(this.y != null) {
            this.y[2] = null;
         }

         this.O = false;
      }
   }

   final boolean a(int var1, int var2, Object[] var3, boolean var4, int var5) {
      Object[] var6 = (Object[])((Object[])this.xb[52]);
      aqa.a(true, var3, var6);
      vta.a((Object[])((Object[])this.xb[13]), var6, 87);
      boolean var7 = false;
      int var15 = Integer.MAX_VALUE;
      int var16 = Integer.MIN_VALUE;
      int var17 = Integer.MAX_VALUE;
      int var18 = Integer.MIN_VALUE;
      if(!this.O) {
         this.h();
      }

      int var19 = this.f_ob - this.Q >> 1;
      int var20 = this.C - this.L >> 1;
      int var21 = this.f_sb - this.X >> 1;
      int var22 = this.Q + var19;
      int var23 = this.L + var20;
      int var24 = this.X + var21;
      int var25 = var22 - (var19 << var5);
      int var26 = var23 - (var20 << var5);
      int var27 = var24 - (var21 << var5);
      int var28 = var22 + (var19 << var5);
      int var29 = var23 + (var20 << var5);
      int var30 = var24 + (var21 << var5);
      x[0] = var25;
      f_wb[0] = var26;
      f_ib[0] = var27;
      x[1] = var28;
      f_wb[1] = var26;
      f_ib[1] = var27;
      x[2] = var25;
      f_wb[2] = var29;
      f_ib[2] = var27;
      x[3] = var28;
      f_wb[3] = var29;
      f_ib[3] = var27;
      x[4] = var25;
      f_wb[4] = var26;
      f_ib[4] = var30;
      x[5] = var28;
      f_wb[5] = var26;
      f_ib[5] = var30;
      x[6] = var25;
      f_wb[6] = var29;
      f_ib[6] = var30;
      x[7] = var28;
      f_wb[7] = var29;
      f_ib[7] = var30;

      float var8;
      float var9;
      float var10;
      float var11;
      int var12;
      int var13;
      int var14;
      int var33;
      for(int var31 = 0; var31 < 8; ++var31) {
         var12 = x[var31];
         var13 = f_wb[var31];
         var14 = f_ib[var31];
         var10 = ((float[])((float[])var6[0]))[2] * (float)var12 + ((float[])((float[])var6[0]))[6] * (float)var13 + ((float[])((float[])var6[0]))[10] * (float)var14 + ((float[])((float[])var6[0]))[14];
         var11 = ((float[])((float[])var6[0]))[3] * (float)var12 + ((float[])((float[])var6[0]))[7] * (float)var13 + ((float[])((float[])var6[0]))[11] * (float)var14 + ((float[])((float[])var6[0]))[15];
         if(var10 >= -var11) {
            var8 = ((float[])((float[])var6[0]))[0] * (float)var12 + ((float[])((float[])var6[0]))[4] * (float)var13 + ((float[])((float[])var6[0]))[8] * (float)var14 + ((float[])((float[])var6[0]))[12];
            var9 = ((float[])((float[])var6[0]))[1] * (float)var12 + ((float[])((float[])var6[0]))[5] * (float)var13 + ((float[])((float[])var6[0]))[9] * (float)var14 + ((float[])((float[])var6[0]))[13];
            int var32 = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var8 / var11);
            var33 = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var9 / var11);
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

      if(var7 && var1 > var15 && var1 < var16 && var2 > var17 && var2 < var18) {
         if(var4) {
            return true;
         }

         if(((int[])((int[])this.xb[48])).length < this.yb) {
            this.xb[48] = new int[this.yb];
            this.xb[39] = new int[this.yb];
         }

         int[] var39 = (int[])((int[])this.xb[48]);
         int[] var38 = (int[])((int[])this.xb[39]);

         for(var33 = 0; var33 < this.f_vb; ++var33) {
            var12 = this.f_cb[var33];
            var13 = this.f_pb[var33];
            var14 = this.f_jb[var33];
            var10 = ((float[])((float[])var6[0]))[2] * (float)var12 + ((float[])((float[])var6[0]))[6] * (float)var13 + ((float[])((float[])var6[0]))[10] * (float)var14 + ((float[])((float[])var6[0]))[14];
            var11 = ((float[])((float[])var6[0]))[3] * (float)var12 + ((float[])((float[])var6[0]))[7] * (float)var13 + ((float[])((float[])var6[0]))[11] * (float)var14 + ((float[])((float[])var6[0]))[15];
            int var34;
            int var35;
            int var36;
            int var37;
            if(var10 >= -var11) {
               var8 = ((float[])((float[])var6[0]))[0] * (float)var12 + ((float[])((float[])var6[0]))[4] * (float)var13 + ((float[])((float[])var6[0]))[8] * (float)var14 + ((float[])((float[])var6[0]))[12];
               var9 = ((float[])((float[])var6[0]))[1] * (float)var12 + ((float[])((float[])var6[0]))[5] * (float)var13 + ((float[])((float[])var6[0]))[9] * (float)var14 + ((float[])((float[])var6[0]))[13];
               var34 = this.Gb[var33];
               var35 = this.Gb[var33 + 1];

               for(var36 = var34; var36 < var35; ++var36) {
                  var37 = this.N[var36] - 1;
                  if(var37 == -1) {
                     break;
                  }

                  var39[var37] = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var8 / var11);
                  var38[var37] = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var9 / var11);
               }
            } else {
               var34 = this.Gb[var33];
               var35 = this.Gb[var33 + 1];

               for(var36 = var34; var36 < var35; ++var36) {
                  var37 = this.N[var36] - 1;
                  if(var37 == -1) {
                     break;
                  }

                  var39[this.N[var36] - 1] = -999999;
               }
            }
         }

         for(var33 = 0; var33 < this.H; ++var33) {
            if(var39[this.Bb[var33]] != -999999 && var39[this.f_gb[var33]] != -999999 && var39[this.M[var33]] != -999999 && this.a(var1, var2, var38[this.Bb[var33]], var38[this.f_gb[var33]], var38[this.M[var33]], var39[this.Bb[var33]], var39[this.f_gb[var33]], var39[this.M[var33]])) {
               return true;
            }
         }
      }

      return false;
   }

   final boolean d() {
      if(this.Y == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < this.Y.length; ++var2) {
            if(this.Y[var2] != -1) {
               Object[] var1 = this.xb;
               if(!((ta)(this.xb == null?null:var1[55])).k.a(-20460, (int)this.Y[var2])) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   final int RA() {
      if(!this.O) {
         this.h();
      }

      return this.f_ob;
   }

   final Object[][] a() {
      return this.f_bb;
   }

   private static final short[] a(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final void a(Object[] var1, lpa var2, int var3) {
      if((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if(this.yb != 0) {
         Object[] var4 = (Object[])((Object[])this.xb[45]);
         Object[] var5 = (Object[])((Object[])this.xb[52]);
         Object[] var6 = (Object[])((Object[])this.xb[36]);
         aqa.a(true, var1, var5);
         sea.a(var5, var6, (byte)125);
         vta.a((Object[])((Object[])this.xb[13]), var6, 122);
         if(!this.O) {
            this.h();
         }

         float[] var7 = (float[])((float[])this.xb[60]);
         jn.a(0.0F, (float)this.L, var7, var5, true, 0.0F);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         jn.a(0.0F, (float)this.C, var7, var5, true, 0.0F);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var17;
         float var16;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = ((float[][])((float[][])this.xb[0]))[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.Db;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.Db;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var21 = false;
            boolean var22 = true;
            int var23 = this.Q + this.f_ob >> 1;
            int var24 = this.X + this.f_sb >> 1;
            short var19 = this.L;
            float var34 = ((float[])((float[])var6[0]))[0] * (float)var23 + ((float[])((float[])var6[0]))[4] * (float)var19 + ((float[])((float[])var6[0]))[8] * (float)var24 + ((float[])((float[])var6[0]))[12];
            float var33 = ((float[])((float[])var6[0]))[1] * (float)var23 + ((float[])((float[])var6[0]))[5] * (float)var19 + ((float[])((float[])var6[0]))[9] * (float)var24 + ((float[])((float[])var6[0]))[13];
            var16 = ((float[])((float[])var6[0]))[2] * (float)var23 + ((float[])((float[])var6[0]))[6] * (float)var19 + ((float[])((float[])var6[0]))[10] * (float)var24 + ((float[])((float[])var6[0]))[14];
            var17 = ((float[])((float[])var6[0]))[3] * (float)var23 + ((float[])((float[])var6[0]))[7] * (float)var19 + ((float[])((float[])var6[0]))[11] * (float)var24 + ((float[])((float[])var6[0]))[15];
            if(var16 >= -var17) {
               var2.f_i = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var34 / var17);
               var2.f_l = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var33 / var17);
            } else {
               var21 = true;
            }

            var19 = this.C;
            float var25 = ((float[])((float[])var6[0]))[0] * (float)var23 + ((float[])((float[])var6[0]))[4] * (float)var19 + ((float[])((float[])var6[0]))[8] * (float)var24 + ((float[])((float[])var6[0]))[12];
            float var26 = ((float[])((float[])var6[0]))[1] * (float)var23 + ((float[])((float[])var6[0]))[5] * (float)var19 + ((float[])((float[])var6[0]))[9] * (float)var24 + ((float[])((float[])var6[0]))[13];
            float var27 = ((float[])((float[])var6[0]))[2] * (float)var23 + ((float[])((float[])var6[0]))[6] * (float)var19 + ((float[])((float[])var6[0]))[10] * (float)var24 + ((float[])((float[])var6[0]))[14];
            float var28 = ((float[])((float[])var6[0]))[3] * (float)var23 + ((float[])((float[])var6[0]))[7] * (float)var19 + ((float[])((float[])var6[0]))[11] * (float)var24 + ((float[])((float[])var6[0]))[15];
            if(var27 >= -var28) {
               var2.n = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var25 / var28);
               var2.m = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var26 / var28);
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
                     var2.f_i = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var30 / var32);
                     var2.f_l = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var34 - var25);
                     var31 = var26 + var29 * (var33 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.n = (int)(((float[])((float[])this.xb[25]))[3] + ((float[])((float[])this.xb[25]))[0] * var30 / var32);
                     var2.m = (int)(((float[])((float[])this.xb[25]))[4] + ((float[])((float[])this.xb[25]))[9] * var31 / var32);
                  }
               }
            }

            if(var22) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var34 + ((float[])((float[])var4[0]))[0] * (float)this.Db + ((float[])((float[])var4[0]))[12];
                  var30 = var17 + ((float[])((float[])var4[0]))[3] * (float)this.Db + ((float[])((float[])var4[0]))[15];
                  var2.j = (int)(((float[])((float[])this.xb[25]))[3] - (float)var2.f_i + ((float[])((float[])this.xb[25]))[0] * var29 / var30);
               } else {
                  var29 = var25 + ((float[])((float[])var4[0]))[0] * (float)this.Db + ((float[])((float[])var4[0]))[12];
                  var30 = var28 + ((float[])((float[])var4[0]))[3] * (float)this.Db + ((float[])((float[])var4[0]))[15];
                  var2.j = (int)(((float[])((float[])this.xb[25]))[3] - (float)var2.n + ((float[])((float[])this.xb[25]))[0] * var29 / var30);
               }

               var2.k = true;
            }
         }

         caa.a(this.xb, (byte)-125);
         OpenGL.glPushMatrix();
         OpenGL.glMultMatrixf((float[])((float[])var5[0]), 0);
         this.i();
         OpenGL.glPopMatrix();
         vta.a((Object[])((Object[])this.xb[46]), var5, 66);
         this.b(var5);
         if((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   final int va() {
      return this.r;
   }

   final void C(int var1) {
      this.W = (short)var1;
      if(this.A != null) {
         this.A[2] = null;
      }

      if(this.f_nb != null) {
         this.f_nb[2] = null;
      }

   }

   final void a(ka var1, int var2, int var3, int var4, boolean var5) {
      qna var6 = (qna)var1;
      if(this.H != 0 && var6.H != 0) {
         int var7 = var6.f_vb;
         int[] var8 = var6.f_cb;
         int[] var9 = var6.f_pb;
         int[] var10 = var6.f_jb;
         short[] var11 = var6.f_qb;
         short[] var12 = var6.Z;
         short[] var13 = var6.u;
         byte[] var14 = var6.p;
         short[] var15;
         short[] var17;
         short[] var16;
         byte[] var18;
         if(this.v != null) {
            var15 = this.v.d;
            var16 = this.v.c;
            var17 = this.v.b;
            var18 = this.v.a;
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
         if(var6.v != null) {
            var19 = var6.v.d;
            var20 = var6.v.c;
            var21 = var6.v.b;
            var22 = var6.v.a;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.Gb;
         short[] var24 = var6.N;
         if(!var6.O) {
            var6.h();
         }

         short var25 = var6.L;
         short var26 = var6.C;
         short var27 = var6.Q;
         short var28 = var6.f_ob;
         short var29 = var6.X;
         short var30 = var6.f_sb;

         for(int var31 = 0; var31 < this.f_vb; ++var31) {
            int var32 = this.f_pb[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.f_cb[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.f_jb[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.Gb[var31];
                     int var37 = this.Gb[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.N[var38] - 1;
                        if(var35 == -1 || this.p[var35] != 0) {
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
                                    this.v = new dr();
                                    var15 = this.v.d = rg.a(this.f_qb, 96);
                                    var16 = this.v.c = rg.a(this.Z, 105);
                                    var17 = this.v.b = rg.a(this.u, 119);
                                    var18 = this.v.a = nm.a(false, this.p);
                                 }

                                 if(var19 == null) {
                                    dr var47 = var6.v = new dr();
                                    var19 = var47.d = rg.a(var11, 72);
                                    var20 = var47.c = rg.a(var12, -68);
                                    var21 = var47.b = rg.a(var13, -79);
                                    var22 = var47.a = nm.a(false, var14);
                                 }

                                 short var46 = this.f_qb[var35];
                                 short var41 = this.Z[var35];
                                 short var42 = this.u[var35];
                                 byte var43 = this.p[var35];
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
                                 var36 = this.Gb[var31];
                                 var37 = this.Gb[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.N[var44] - 1;
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

                                 if(this.f_nb == null && this.A != null) {
                                    this.A[2] = null;
                                 }

                                 if(this.f_nb != null) {
                                    this.f_nb[2] = null;
                                 }

                                 if(var6.f_nb == null && var6.A != null) {
                                    var6.A[2] = null;
                                 }

                                 if(var6.f_nb != null) {
                                    var6.f_nb[2] = null;
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
   }

   final int MA() {
      if(!this.O) {
         this.h();
      }

      return this.Db;
   }

   final void TA() {
      for(int var1 = 0; var1 < this.zb; ++var1) {
         this.f_cb[var1] = this.f_cb[var1] + 7 >> 4;
         this.f_pb[var1] = this.f_pb[var1] + 7 >> 4;
         this.f_jb[var1] = this.f_jb[var1] + 7 >> 4;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   final int ra() {
      if(!this.O) {
         this.h();
      }

      return this.f_mb;
   }

   final void S() {
      int var1;
      for(var1 = 0; var1 < this.f_vb; ++var1) {
         this.f_jb[var1] = -this.f_jb[var1];
      }

      for(var1 = 0; var1 < this.yb; ++var1) {
         this.u[var1] = (short)(-this.u[var1]);
      }

      for(var1 = 0; var1 < this.H; ++var1) {
         short var2 = this.Bb[var1];
         this.Bb[var1] = this.M[var1];
         this.M[var1] = var2;
      }

      if(this.f_nb == null && this.A != null) {
         this.A[2] = null;
      }

      if(this.f_nb != null) {
         this.f_nb[2] = null;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      if(this.D != null) {
         this.D.a = null;
      }

      this.O = false;
   }

   final Object[][] b() {
      return this.f_eb;
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

      for(int var9 = 0; var9 < this.f_vb; ++var9) {
         int var10 = this.f_cb[var9];
         int var11 = this.f_pb[var9];
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

      this.Q = (short)var1;
      this.f_ob = (short)var4;
      this.L = (short)var2;
      this.C = (short)var5;
      this.X = (short)var3;
      this.f_sb = (short)var6;
      this.Db = (short)((int)(Math.sqrt((double)var7) + 0.99D));
      this.f_mb = (short)((int)(Math.sqrt((double)var8) + 0.99D));
      this.O = true;
   }

   final void c() {}

   private final ka a(qna var1, qna var2, int var3, boolean var4, boolean var5) {
      var1.B = 0;
      var1.r = var3;
      var1.K = this.K;
      var1.f_rb = this.f_rb;
      var1.W = this.W;
      var1.zb = this.zb;
      var1.f_vb = this.f_vb;
      var1.yb = this.yb;
      var1.H = this.H;
      var1.f_db = this.f_db;
      var1.F = this.F;
      if((var3 & 256) != 0) {
         var1.w = true;
      } else {
         var1.w = this.w;
      }

      var1.U = this.U;
      boolean var6 = (33 & var3) != 0;
      boolean var7 = var6;
      boolean var8 = isa.a(0, this.K, var3);
      boolean var9 = uma.b((byte)91, var3, this.K);
      boolean var10 = var6 | var8 | var9;
      int var11;
      if(var10) {
         if(var6) {
            if(var2.f_cb != null && var2.f_cb.length >= this.zb) {
               var1.f_cb = var2.f_cb;
            } else {
               var1.f_cb = var2.f_cb = new int[this.zb];
            }
         } else {
            var1.f_cb = this.f_cb;
         }

         if(var8) {
            if(var2.f_pb != null && var2.f_pb.length >= this.zb) {
               var1.f_pb = var2.f_pb;
            } else {
               var1.f_pb = var2.f_pb = new int[this.zb];
            }
         } else {
            var1.f_pb = this.f_pb;
         }

         if(var9) {
            if(var2.f_jb != null && var2.f_jb.length >= this.zb) {
               var1.f_jb = var2.f_jb;
            } else {
               var1.f_jb = var2.f_jb = new int[this.zb];
            }
         } else {
            var1.f_jb = this.f_jb;
         }

         for(var11 = 0; var11 < this.zb; ++var11) {
            if(var7) {
               var1.f_cb[var11] = this.f_cb[var11];
            }

            if(var8) {
               var1.f_pb[var11] = this.f_pb[var11];
            }

            if(var9) {
               var1.f_jb[var11] = this.f_jb[var11];
            }
         }
      } else {
         var1.f_cb = this.f_cb;
         var1.f_pb = this.f_pb;
         var1.f_jb = this.f_jb;
      }

      boolean var25;
      if(wca.a(this.K, -77, var3)) {
         if(var4) {
            var1.B = (byte)(var1.B | 1);
         }

         var1.y = var2.y;
         ((byte[])((byte[])var1.y[1]))[1] = ((byte[])((byte[])this.y[1]))[1];
         var1.y[2] = this.y[2];
      } else {
         var25 = 0 != (var3 & 2048);
         if(var25) {
            var1.y = this.y;
         } else {
            var1.y = null;
         }
      }

      if(bqa.a(this.K, (byte)-75, var3)) {
         if(var2.Ab != null && var2.Ab.length >= this.H) {
            var1.Ab = var2.Ab;
         } else {
            var1.Ab = var2.Ab = new short[this.H];
         }

         for(var11 = 0; var11 < this.H; ++var11) {
            var1.Ab[var11] = this.Ab[var11];
         }
      } else {
         var1.Ab = this.Ab;
      }

      var25 = 0 != (var3 & 1048832);
      int var12;
      if(var25) {
         if(var2.f_kb != null && var2.f_kb.length >= this.H) {
            var1.f_kb = var2.f_kb;
         } else {
            var1.f_kb = var2.f_kb = new byte[this.H];
         }

         for(var12 = 0; var12 < this.H; ++var12) {
            var1.f_kb[var12] = this.f_kb[var12];
         }
      } else {
         var1.f_kb = this.f_kb;
      }

      boolean var24;
      if(ev.a(var3, true, this.K)) {
         if(var4) {
            var1.B = (byte)(var1.B | 2);
         }

         var1.A = var2.A;
         ((byte[])((byte[])var1.A[1]))[1] = ((byte[])((byte[])this.A[1]))[1];
         var1.A[2] = this.A[2];
      } else {
         var24 = (var3 & 2048) != 0;
         if(var24) {
            var1.A = this.A;
         } else {
            var1.A = null;
         }
      }

      int var13;
      if(rr.a(var3, this.K, 0)) {
         if(var2.f_qb != null && var2.f_qb.length >= this.yb) {
            var1.f_qb = var2.f_qb;
            var1.Z = var2.Z;
            var1.u = var2.u;
         } else {
            var12 = this.yb;
            var1.f_qb = var2.f_qb = new short[var12];
            var1.Z = var2.Z = new short[var12];
            var1.u = var2.u = new short[var12];
         }

         if(this.v != null) {
            if(var2.v == null) {
               var2.v = new dr();
            }

            dr var26 = var1.v = var2.v;
            if(var26.d == null || var26.d.length < this.yb) {
               var13 = this.yb;
               var26.d = new short[var13];
               var26.c = new short[var13];
               var26.b = new short[var13];
               var26.a = new byte[var13];
            }

            for(var13 = 0; var13 < this.yb; ++var13) {
               var1.f_qb[var13] = this.f_qb[var13];
               var1.Z[var13] = this.Z[var13];
               var1.u[var13] = this.u[var13];
               var26.d[var13] = this.v.d[var13];
               var26.c[var13] = this.v.c[var13];
               var26.b[var13] = this.v.b[var13];
               var26.a[var13] = this.v.a[var13];
            }
         } else {
            for(var12 = 0; var12 < this.yb; ++var12) {
               var1.f_qb[var12] = this.f_qb[var12];
               var1.Z[var12] = this.Z[var12];
               var1.u[var12] = this.u[var12];
            }
         }

         var1.p = this.p;
      } else {
         var1.v = this.v;
         var1.f_qb = this.f_qb;
         var1.Z = this.Z;
         var1.u = this.u;
         var1.p = this.p;
      }

      var13 = this.K;
      boolean var14 = rr.a(var3, var13, 0) | 0 != (var3 & 8192) | ira.a(var3, -104, var13);
      boolean var15 = (2048 & var3) != 0 && -1 != ~(var13 & 55);
      var24 = var14 & var15;
      int var27;
      if(var24) {
         if(var4) {
            var1.B = (byte)(var1.B | 4);
         }

         var1.f_nb = var2.f_nb;
         ((byte[])((byte[])var1.f_nb[1]))[1] = ((byte[])((byte[])this.f_nb[1]))[1];
         var1.f_nb[2] = this.f_nb[2];
      } else {
         var27 = this.K;
         var14 = -1 != ~(var3 & 2048) && (var27 & 55) != 0;
         if(var14) {
            var1.f_nb = this.f_nb;
         } else {
            var1.f_nb = null;
         }
      }

      var14 = false;
      if(var14) {
         if(var2.P != null && var2.P.length >= this.H) {
            var1.P = var2.P;
            var1.s = var2.s;
         } else {
            var27 = this.yb;
            var1.P = var2.P = new float[var27];
            var1.s = var2.s = new float[var27];
         }

         for(var27 = 0; var27 < this.yb; ++var27) {
            var1.P[var27] = this.P[var27];
            var1.s[var27] = this.s[var27];
         }
      } else {
         var1.P = this.P;
         var1.s = this.s;
      }

      boolean var16 = false;
      boolean var18 = 0 != (var3 & 2048);
      var15 = var16 & var18;
      if(var15) {
         if(var4) {
            var1.B = (byte)(var1.B | 8);
         }

         var1.z = var2.z;
         ((byte[])((byte[])var1.z[1]))[1] = ((byte[])((byte[])this.z[1]))[1];
         var1.z[2] = this.z[2];
      } else {
         var16 = -1 != ~(var3 & 2048);
         if(var16) {
            var1.z = this.z;
         } else {
            var1.z = null;
         }
      }

      var16 = 0 != (16 & var3);
      if(var16) {
         int var17;
         if(var2.Bb != null && var2.Bb.length >= this.H) {
            var1.Bb = var2.Bb;
            var1.f_gb = var2.f_gb;
            var1.M = var2.M;
         } else {
            var17 = this.H;
            var1.Bb = var2.Bb = new short[var17];
            var1.f_gb = var2.f_gb = new short[var17];
            var1.M = var2.M = new short[var17];
         }

         for(var17 = 0; var17 < this.H; ++var17) {
            var1.Bb[var17] = this.Bb[var17];
            var1.f_gb[var17] = this.f_gb[var17];
            var1.M[var17] = this.M[var17];
         }
      } else {
         var1.Bb = this.Bb;
         var1.f_gb = this.f_gb;
         var1.M = this.M;
      }

      int var29 = this.K;
      boolean var19 = (var3 & 16) != 0;
      boolean var28 = bna.a(var3, 120, var29) & var19;
      if(var28) {
         if(var4) {
            var1.B = (byte)(var1.B | 16);
         }

         var1.D = var2.D;
         var1.D.a = this.D.a;
      } else if(bna.a(var3, 89, this.K)) {
         var1.D = this.D;
      } else {
         var1.D = null;
      }

      var19 = -1 != ~('\u8000' & var3);
      if(var19) {
         int var20;
         if(var2.Y != null && var2.Y.length >= this.H) {
            var1.Y = var2.Y;
         } else {
            var20 = this.H;
            var1.Y = var2.Y = new short[var20];
         }

         for(var20 = 0; var20 < this.H; ++var20) {
            var1.Y[var20] = this.Y[var20];
         }
      } else {
         var1.Y = this.Y;
      }

      boolean var31 = 0 != (var3 & '\uc580');
      if(var31) {
         int var21;
         if(var2.G != null && var2.G.length >= this.F) {
            var1.G = var2.G;

            for(var21 = 0; var21 < this.F; ++var21) {
               Object[] var30 = var1.G[var21];
               Object[] var23 = this.G[var21];
               ((int[])((int[])var30[0]))[1] = ((int[])((int[])var23[0]))[1];
               ((int[])((int[])var30[0]))[3] = ((int[])((int[])var23[0]))[3];
               ((int[])((int[])var30[0]))[2] = ((int[])((int[])var23[0]))[2];
               ((int[])((int[])var30[0]))[5] = ((int[])((int[])var23[0]))[5];
               ((int[])((int[])var30[0]))[4] = ((int[])((int[])var23[0]))[4];
               ((int[])((int[])var30[0]))[0] = ((int[])((int[])var23[0]))[0];
            }
         } else {
            var21 = this.F;
            var1.G = var2.G = new Object[var21][];

            for(int var22 = 0; var22 < this.F; ++var22) {
               var1.G[var22] = sha.a((byte)-86, this.G[var22]);
            }
         }
      } else {
         var1.G = this.G;
      }

      var1.f_ub = this.f_ub;
      if(this.O) {
         var1.f_mb = this.f_mb;
         var1.Db = this.Db;
         var1.Q = this.Q;
         var1.f_ob = this.f_ob;
         var1.L = this.L;
         var1.C = this.C;
         var1.X = this.X;
         var1.f_sb = this.f_sb;
         var1.O = true;
      } else {
         var1.O = false;
      }

      var1.Hb = this.Hb;
      var1.Eb = this.Eb;
      var1.f_ab = this.f_ab;
      var1.N = this.N;
      var1.Gb = this.Gb;
      var1.Cb = this.Cb;
      var1.f_hb = this.f_hb;
      var1.Fb = this.Fb;
      var1.f_bb = this.f_bb;
      var1.f_eb = this.f_eb;
      return var1;
   }

   final int da() {
      if(!this.O) {
         this.h();
      }

      return this.X;
   }

   final int LA() {
      if(!this.O) {
         this.h();
      }

      return this.Q;
   }

   private final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   final void K(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.f_vb; ++var4) {
         if(var1 != 0) {
            this.f_cb[var4] += var1;
         }

         if(var2 != 0) {
            this.f_pb[var4] += var2;
         }

         if(var3 != 0) {
            this.f_jb[var4] += var3;
         }
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   final void fa(int var1) {
      int var2 = tda.p[var1];
      int var3 = tda.k[var1];

      for(int var4 = 0; var4 < this.f_vb; ++var4) {
         int var5 = this.f_pb[var4] * var2 + this.f_cb[var4] * var3 >> 14;
         this.f_pb[var4] = this.f_pb[var4] * var3 - this.f_cb[var4] * var2 >> 14;
         this.f_cb[var4] = var5;
      }

      if(this.y != null) {
         this.y[2] = null;
      }

      this.O = false;
   }

   final void YA(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         I = 0;
         f_lb = 0;
         f_fb = 0;

         for(var10 = 0; var10 < this.f_vb; ++var10) {
            I += this.f_cb[var10];
            f_lb += this.f_pb[var10];
            f_fb += this.f_jb[var10];
            ++var5;
         }

         if(var5 > 0) {
            I = I / var5 + var2;
            f_lb = f_lb / var5 + var3;
            f_fb = f_fb / var5 + var4;
         } else {
            I = var2;
            f_lb = var3;
            f_fb = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.f_vb; ++var5) {
            this.f_cb[var5] += var2;
            this.f_pb[var5] += var3;
            this.f_jb[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.f_vb; ++var5) {
               this.f_cb[var5] -= I;
               this.f_pb[var5] -= f_lb;
               this.f_jb[var5] -= f_fb;
               if(var4 != 0) {
                  var10 = tda.p[var4];
                  var7 = tda.k[var4];
                  var8 = this.f_pb[var5] * var10 + this.f_cb[var5] * var7 + 16383 >> 14;
                  this.f_pb[var5] = this.f_pb[var5] * var7 - this.f_cb[var5] * var10 + 16383 >> 14;
                  this.f_cb[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = tda.p[var2];
                  var7 = tda.k[var2];
                  var8 = this.f_pb[var5] * var7 - this.f_jb[var5] * var10 + 16383 >> 14;
                  this.f_jb[var5] = this.f_pb[var5] * var10 + this.f_jb[var5] * var7 + 16383 >> 14;
                  this.f_pb[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = tda.p[var3];
                  var7 = tda.k[var3];
                  var8 = this.f_jb[var5] * var10 + this.f_cb[var5] * var7 + 16383 >> 14;
                  this.f_jb[var5] = this.f_jb[var5] * var7 - this.f_cb[var5] * var10 + 16383 >> 14;
                  this.f_cb[var5] = var8;
               }

               this.f_cb[var5] += I;
               this.f_pb[var5] += f_lb;
               this.f_jb[var5] += f_fb;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.f_vb; ++var5) {
               this.f_cb[var5] -= I;
               this.f_pb[var5] -= f_lb;
               this.f_jb[var5] -= f_fb;
               this.f_cb[var5] = this.f_cb[var5] * var2 / 128;
               this.f_pb[var5] = this.f_pb[var5] * var3 / 128;
               this.f_jb[var5] = this.f_jb[var5] * var4 / 128;
               this.f_cb[var5] += I;
               this.f_pb[var5] += f_lb;
               this.f_jb[var5] += f_fb;
            }

         } else {
            Object[] var6;
            Object[] var11;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.H; ++var5) {
                  var10 = (this.f_kb[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.f_kb[var5] = (byte)var10;
               }

               if(this.A != null) {
                  this.A[2] = null;
               }

               if(this.f_ub != null) {
                  for(var5 = 0; var5 < this.F; ++var5) {
                     var6 = this.f_ub[var5];
                     var11 = this.G[var5];
                     ((int[])((int[])var11[0]))[0] = ((int[])((int[])var11[0]))[0] & 16777215 | 255 - (this.f_kb[((int[])((int[])var6[1]))[4]] & 255) << 24;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.H; ++var5) {
                  var10 = this.Ab[var5] & '\uffff';
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

                  this.Ab[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.A != null) {
                  this.A[2] = null;
               }

               if(this.f_ub != null) {
                  for(var5 = 0; var5 < this.F; ++var5) {
                     var6 = this.f_ub[var5];
                     var11 = this.G[var5];
                     ((int[])((int[])var11[0]))[0] = ((int[])((int[])var11[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var6[1]))[4]] & '\uffff'] & 16777215;
                  }
               }

            } else if(var1 == 8) {
               for(var5 = 0; var5 < this.F; ++var5) {
                  var6 = this.G[var5];
                  ((int[])((int[])var6[0]))[5] += var2;
                  ((int[])((int[])var6[0]))[3] += var3;
               }

            } else if(var1 == 10) {
               for(var5 = 0; var5 < this.F; ++var5) {
                  var6 = this.G[var5];
                  ((int[])((int[])var6[0]))[2] = ((int[])((int[])var6[0]))[2] * var2 >> 7;
                  ((int[])((int[])var6[0]))[4] = ((int[])((int[])var6[0]))[4] * var3 >> 7;
               }

            } else if(var1 == 9) {
               for(var5 = 0; var5 < this.F; ++var5) {
                  var6 = this.G[var5];
                  ((int[])((int[])var6[0]))[1] = ((int[])((int[])var6[0]))[1] + var2 & 16383;
               }

            }
         }
      }
   }

   final boolean QA() {
      if(this.Hb == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.zb; ++var1) {
            this.f_cb[var1] <<= 4;
            this.f_pb[var1] <<= 4;
            this.f_jb[var1] <<= 4;
         }

         I = 0;
         f_lb = 0;
         f_fb = 0;
         return true;
      }
   }

   final void W(int var1) {
      this.f_rb = (short)var1;
      if(this.A != null) {
         this.A[2] = null;
      }

   }

   final boolean m() {
      return this.U;
   }

   private static final int a(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   final void q(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.H; ++var3) {
         if(this.Ab[var3] == var1) {
            this.Ab[var3] = var2;
         }
      }

      if(this.f_ub != null) {
         for(var3 = 0; var3 < this.F; ++var3) {
            Object[] var4 = this.f_ub[var3];
            Object[] var5 = this.G[var3];
            ((int[])((int[])var5[0]))[0] = ((int[])((int[])var5[0]))[0] & -16777216 | tpa.f[this.Ab[((int[])((int[])var4[1]))[4]] & '\uffff'] & 16777215;
         }
      }

      if(this.A != null) {
         this.A[2] = null;
      }

   }

   final void f() {
      if(this.yb > 0 && this.f_db > 0) {
         this.a(false);
         if((this.B & 16) == 0 && this.D.a == null) {
            this.b(false);
         }

         this.g();
      }
   }

   final void a(Object[] var1) {
      Object[] var2 = (Object[])((Object[])this.xb[52]);
      aqa.a(true, var1, var2);
      int var3;
      Object[] var4;
      Object[] var5;
      if(this.f_bb != null) {
         for(var3 = 0; var3 < this.f_bb.length; ++var3) {
            var4 = this.f_bb[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            ((int[])((int[])var5[1]))[12] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.f_cb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[4] * (float)this.f_pb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[5] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.f_cb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[5] * (float)this.f_pb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[4] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.f_cb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[6] * (float)this.f_pb[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.f_cb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[4] * (float)this.f_pb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[9] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.f_cb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[5] * (float)this.f_pb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[7] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.f_cb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[6] * (float)this.f_pb[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[0] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.f_cb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[4] * (float)this.f_pb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[8] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.f_cb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[5] * (float)this.f_pb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[11] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.f_cb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[6] * (float)this.f_pb[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[6]]);
         }
      }

      if(this.f_eb != null) {
         for(var3 = 0; var3 < this.f_eb.length; ++var3) {
            var4 = this.f_eb[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            if(var4[0] != null) {
               sea.a(var2, (Object[])((Object[])var4[0]), (byte)117);
            } else {
               var4[0] = ona.a(new Object[2], var2, (byte)125);
            }

            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.f_cb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[4] * (float)this.f_pb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[8] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[1] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.f_cb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[5] * (float)this.f_pb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[9] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[3] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.f_cb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[6] * (float)this.f_pb[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[10] * (float)this.f_jb[((int[])((int[])var4[1]))[0]]);
         }
      }

   }

   final ya p(ya var1) {
      if(this.yb == 0) {
         return null;
      } else {
         if(!this.O) {
            this.h();
         }

         int var4;
         int var5;
         if(((int[])((int[])this.xb[1]))[30] > 0) {
            var4 = this.Q - (this.C * ((int[])((int[])this.xb[1]))[30] >> 8) >> ((int[])((int[])this.xb[1]))[9];
            var5 = this.f_ob - (this.L * ((int[])((int[])this.xb[1]))[30] >> 8) >> ((int[])((int[])this.xb[1]))[9];
         } else {
            var4 = this.Q - (this.L * ((int[])((int[])this.xb[1]))[30] >> 8) >> ((int[])((int[])this.xb[1]))[9];
            var5 = this.f_ob - (this.C * ((int[])((int[])this.xb[1]))[30] >> 8) >> ((int[])((int[])this.xb[1]))[9];
         }

         int var6;
         int var7;
         if(((int[])((int[])this.xb[1]))[31] > 0) {
            var6 = this.X - (this.C * ((int[])((int[])this.xb[1]))[31] >> 8) >> ((int[])((int[])this.xb[1]))[9];
            var7 = this.f_sb - (this.L * ((int[])((int[])this.xb[1]))[31] >> 8) >> ((int[])((int[])this.xb[1]))[9];
         } else {
            var6 = this.X - (this.L * ((int[])((int[])this.xb[1]))[31] >> 8) >> ((int[])((int[])this.xb[1]))[9];
            var7 = this.f_sb - (this.C * ((int[])((int[])this.xb[1]))[31] >> 8) >> ((int[])((int[])this.xb[1]))[9];
         }

         Object[] var10;
         label41: {
            int var8 = var5 - var4 + 1;
            int var9 = var7 - var6 + 1;
            uma var2;
            Object[] var11 = (var2 = (uma)var1) == null?null:var2.A;
            if(var11 != null) {
               boolean var12 = ~((byte[])((byte[])var11[0])).length <= ~(var8 * var9);
               if(var12) {
                  var10 = var11;
                  hja.a(var11, (byte)0);
                  break label41;
               }
            }

            var10 = cb.a(new Object[3], 101, this.xb, var8, var9);
         }

         lk.a(var6, var10, var7, var5, var4, 18211);
         this.c(var10);
         return (ya)(var10 == null?null:var10[2]);
      }
   }

   final int BA() {
      return this.f_rb;
   }

   qna(Object[] var1) {
      this.xb = var1;
      this.y = dq.a((Object[])null, 5126, 3, 0, new Object[3], 3);
      this.z = dq.a((Object[])null, 5126, 2, 0, new Object[3], 3);
      this.f_nb = dq.a((Object[])null, 5126, 3, 0, new Object[3], 3);
      this.A = dq.a((Object[])null, 5121, 4, 0, new Object[3], 3);
      this.D = new in();
   }

   qna(Object[] var1, ii var2, int var3, int var4, int var5, int var6) {
      this.xb = var1;
      this.r = var3;
      this.K = var6;
      boolean var8 = (2048 & var3) != 0;
      if(var8) {
         this.y = dq.a((Object[])null, 5126, 3, 0, new Object[3], 3);
      }

      boolean var9 = (2048 & var3) != 0;
      if(var9) {
         this.z = dq.a((Object[])null, 5126, 2, 0, new Object[3], 3);
      }

      boolean var10 = (2048 & var3) != 0 && 0 != (55 & var6);
      if(var10) {
         this.f_nb = dq.a((Object[])null, 5126, 3, 0, new Object[3], 3);
      }

      boolean var11 = 0 != (2048 & var3);
      if(var11) {
         this.A = dq.a((Object[])null, 5121, 4, 0, new Object[3], 3);
      }

      if(bna.a(var3, 106, var6)) {
         this.D = new in();
      }

      qa var12 = ((ta)(var1 == null?null:var1[55])).k;
      int[] var13 = new int[var2.I];
      this.Gb = new int[var2.g + 1];

      for(int var14 = 0; var14 < var2.I; ++var14) {
         if(var2.C == null || var2.C[var14] != 2) {
            if(var2.y != null && var2.y[var14] != -1) {
               Object[] var15 = var12.a(var2.y[var14] & '\uffff', (byte)49);
               if(((this.K & 64) == 0 || !((boolean[])((boolean[])var15[3]))[7]) && ((boolean[])((boolean[])var15[3]))[3]) {
                  continue;
               }
            }

            var13[this.H++] = var14;
            ++this.Gb[var2.p[var14]];
            ++this.Gb[var2.b[var14]];
            ++this.Gb[var2.J[var14]];
         }
      }

      this.f_db = this.H;
      long[] var69 = new long[this.H];
      boolean var68 = (this.r & 256) != 0;

      int var17;
      int var19;
      Object[] var18;
      boolean var23;
      Object[] var25;
      int var24;
      Object[] var27;
      int var71;
      short var82;
      for(int var16 = 0; var16 < this.H; ++var16) {
         var17 = var13[var16];
         var18 = null;
         var19 = 0;
         byte var20 = 0;
         byte var21 = 0;
         byte var22 = 0;
         if(var2.v != null) {
            var23 = false;

            for(var24 = 0; var24 < var2.v.length; ++var24) {
               var25 = var2.v[var24];
               if(var17 == ((int[])((int[])var25[0]))[3]) {
                  Object[] var26 = hsa.a(((int[])((int[])var25[0]))[0], -83);
                  if(((boolean[])((boolean[])var26[0]))[0]) {
                     var23 = true;
                  }

                  if(((int[])((int[])var26[1]))[1] != -1) {
                     var27 = var12.a(((int[])((int[])var26[1]))[1], (byte)102);
                     if(((int[])((int[])var27[1]))[0] == 2) {
                        this.w = true;
                     }
                  }
               }
            }

            if(var23) {
               var69[var16] = Long.MAX_VALUE;
               --this.f_db;
               continue;
            }
         }

         var82 = -1;
         if(var2.y != null) {
            var82 = var2.y[var17];
            if(var82 != -1) {
               var18 = var12.a(var82 & '\uffff', (byte)121);
               if((this.K & 64) != 0 && ((boolean[])((boolean[])var18[3]))[7]) {
                  var82 = -1;
                  var18 = null;
               } else {
                  var21 = ((byte[])((byte[])var18[0]))[4];
                  var22 = ((byte[])((byte[])var18[0]))[0];
                  if(((byte[])((byte[])var18[0]))[5] != 0 || ((byte[])((byte[])var18[0]))[6] != 0) {
                     this.U = true;
                  }
               }
            }
         }

         boolean var83 = var2.d != null && var2.d[var17] != 0 || var18 != null && ((int[])((int[])var18[1]))[0] != 0;
         if((var68 || var83) && var2.D != null) {
            var19 += var2.D[var17] << 17;
         }

         if(var83) {
            var19 += 65536;
         }

         var19 += (var21 & 255) << 8;
         var19 += var22 & 255;
         var71 = var20 + ((var82 & '\uffff') << 16);
         var71 += var16 & '\uffff';
         var69[var16] = ((long)var19 << 32) + (long)var71;
         this.w |= var83;
         this.U |= var18 != null && (((byte[])((byte[])var18[0]))[5] != 0 || ((byte[])((byte[])var18[0]))[6] != 0);
      }

      cv.a(var13, (byte)-127, var69);
      this.zb = var2.u;
      this.f_vb = var2.g;
      this.f_cb = var2.f_l;
      this.f_pb = var2.h;
      this.f_jb = var2.z;
      this.Cb = var2.e;
      ak[] var70 = new ak[this.f_vb];
      this.f_bb = var2.s;
      this.f_eb = var2.q;
      Object[] var76;
      int var77;
      if(var2.v != null) {
         this.F = var2.v.length;
         this.f_ub = new Object[this.F][];
         this.G = new Object[this.F][];

         for(var17 = 0; var17 < this.F; ++var17) {
            var18 = var2.v[var17];
            var76 = hsa.a(((int[])((int[])var18[0]))[0], -100);
            var71 = -1;

            for(var77 = 0; var77 < this.H; ++var77) {
               if(var13[var77] == ((int[])((int[])var18[0]))[3]) {
                  var71 = var77;
                  break;
               }
            }

            if(var71 == -1) {
               throw new RuntimeException();
            }

            var77 = tpa.f[var2.A[((int[])((int[])var18[0]))[3]] & '\uffff'] & 16777215;
            var77 |= 255 - (var2.d != null?var2.d[((int[])((int[])var18[0]))[3]]:0) << 24;
            this.f_ub[var17] = kv.a(((int[])((int[])var76[1]))[3], ((boolean[])((boolean[])var76[0]))[0], 3, var2.b[((int[])((int[])var18[0]))[3]], new Object[4], ((int[])((int[])var76[1]))[1], ((int[])((int[])var76[1]))[4], ((int[])((int[])var18[0]))[2], var2.J[((int[])((int[])var18[0]))[3]], ((int[])((int[])var76[1]))[0], var2.p[((int[])((int[])var18[0]))[3]], ((boolean[])((boolean[])var76[0]))[1], var71, ((int[])((int[])var76[1]))[2]);
            Object[][] var74 = this.G;
            var25 = new Object[1];
            af.a(0, var25);
            ((int[])((int[])var25[0]))[2] = 128;
            ((int[])((int[])var25[0]))[4] = 128;
            ((int[])((int[])var25[0]))[0] = var77;
            var74[var17] = var25;
         }
      }

      var17 = this.H * 3;
      this.f_qb = new short[var17];
      this.Z = new short[var17];
      this.u = new short[var17];
      this.p = new byte[var17];
      this.P = new float[var17];
      this.s = new float[var17];
      this.Ab = new short[this.H];
      this.f_kb = new byte[this.H];
      this.Bb = new short[this.H];
      this.f_gb = new short[this.H];
      this.M = new short[this.H];
      this.Y = new short[this.H];
      if(var2.x != null) {
         this.f_hb = new short[this.H];
      }

      this.f_rb = (short)var4;
      this.W = (short)var5;
      this.N = new short[var17];
      t = new long[var17];
      int var72 = 0;

      for(var19 = 0; var19 < var2.g; ++var19) {
         var71 = this.Gb[var19];
         this.Gb[var19] = var72;
         var72 += var71;
         var70[var19] = new ak();
      }

      this.Gb[var2.g] = var72;
      var76 = gba.a(var2, -30075, this.H, var13);
      nna[] var73 = new nna[var2.I];

      short var78;
      short var75;
      int var87;
      int var80;
      int var89;
      for(var77 = 0; var77 < var2.I; ++var77) {
         var75 = var2.p[var77];
         var82 = var2.b[var77];
         var78 = var2.J[var77];
         var80 = this.f_cb[var82] - this.f_cb[var75];
         var87 = this.f_pb[var82] - this.f_pb[var75];
         var89 = this.f_jb[var82] - this.f_jb[var75];
         int var28 = this.f_cb[var78] - this.f_cb[var75];
         int var29 = this.f_pb[var78] - this.f_pb[var75];
         int var30 = this.f_jb[var78] - this.f_jb[var75];
         int var31 = var87 * var30 - var29 * var89;
         int var32 = var89 * var28 - var30 * var80;

         int var33;
         for(var33 = var80 * var29 - var28 * var87; var31 > 8192 || var32 > 8192 || var33 > 8192 || var31 < -8192 || var32 < -8192 || var33 < -8192; var33 >>= 1) {
            var31 >>= 1;
            var32 >>= 1;
         }

         int var34 = (int)Math.sqrt((double)(var31 * var31 + var32 * var32 + var33 * var33));
         if(var34 <= 0) {
            var34 = 1;
         }

         var31 = var31 * 256 / var34;
         var32 = var32 * 256 / var34;
         var33 = var33 * 256 / var34;
         byte var35 = var2.C == null?0:var2.C[var77];
         if(var35 == 0) {
            ak var36 = var70[var75];
            var36.b += var31;
            var36.d += var32;
            var36.c += var33;
            ++var36.a;
            var36 = var70[var82];
            var36.b += var31;
            var36.d += var32;
            var36.c += var33;
            ++var36.a;
            var36 = var70[var78];
            var36.b += var31;
            var36.d += var32;
            var36.c += var33;
            ++var36.a;
         } else if(var35 == 1) {
            nna var101 = var73[var77] = new nna();
            var101.c = var31;
            var101.a = var32;
            var101.b = var33;
         }
      }

      int var79;
      for(var77 = 0; var77 < this.H; ++var77) {
         int var81 = var13[var77];
         var79 = var2.A[var81] & '\uffff';
         if(var2.n == null) {
            var24 = -1;
         } else {
            var24 = var2.n[var81];
         }

         if(var2.d == null) {
            var80 = 0;
         } else {
            var80 = var2.d[var81] & 255;
         }

         short var86 = var2.y == null?-1:var2.y[var81];
         if(var86 != -1 && (this.K & 64) != 0) {
            var27 = var12.a(var86 & '\uffff', (byte)104);
            if(((boolean[])((boolean[])var27[3]))[7]) {
               var86 = -1;
            }
         }

         float var84 = 0.0F;
         float var85 = 0.0F;
         float var91 = 0.0F;
         float var90 = 0.0F;
         float var94 = 0.0F;
         float var93 = 0.0F;
         byte var92 = 0;
         byte var95 = 0;
         int var96 = 0;
         short var39;
         short var40;
         short var41;
         byte var100;
         if(var86 != -1) {
            if(var24 == -1) {
               var84 = 0.0F;
               var85 = 1.0F;
               var91 = 1.0F;
               var90 = 1.0F;
               var92 = 1;
               var94 = 0.0F;
               var93 = 0.0F;
               var95 = 2;
            } else {
               var24 &= 255;
               var100 = var2.G[var24];
               short var38;
               short var37;
               float var46;
               float var47;
               float var45;
               float var59;
               float var58;
               float var57;
               float var62;
               float var61;
               float var60;
               if(var100 == 0) {
                  var37 = var2.p[var81];
                  var38 = var2.b[var81];
                  var39 = var2.J[var81];
                  var40 = var2.r[var24];
                  var41 = var2.F[var24];
                  short var42 = var2.E[var24];
                  float var43 = (float)var2.f_l[var40];
                  float var44 = (float)var2.h[var40];
                  var45 = (float)var2.z[var40];
                  var46 = (float)var2.f_l[var41] - var43;
                  var47 = (float)var2.h[var41] - var44;
                  float var48 = (float)var2.z[var41] - var45;
                  float var49 = (float)var2.f_l[var42] - var43;
                  float var50 = (float)var2.h[var42] - var44;
                  float var51 = (float)var2.z[var42] - var45;
                  float var52 = (float)var2.f_l[var37] - var43;
                  float var53 = (float)var2.h[var37] - var44;
                  float var54 = (float)var2.z[var37] - var45;
                  float var55 = (float)var2.f_l[var38] - var43;
                  float var56 = (float)var2.h[var38] - var44;
                  var57 = (float)var2.z[var38] - var45;
                  var58 = (float)var2.f_l[var39] - var43;
                  var59 = (float)var2.h[var39] - var44;
                  var60 = (float)var2.z[var39] - var45;
                  var61 = var47 * var51 - var48 * var50;
                  var62 = var48 * var49 - var46 * var51;
                  float var63 = var46 * var50 - var47 * var49;
                  float var64 = var50 * var63 - var51 * var62;
                  float var65 = var51 * var61 - var49 * var63;
                  float var66 = var49 * var62 - var50 * var61;
                  float var67 = 1.0F / (var64 * var46 + var65 * var47 + var66 * var48);
                  var84 = (var64 * var52 + var65 * var53 + var66 * var54) * var67;
                  var91 = (var64 * var55 + var65 * var56 + var66 * var57) * var67;
                  var94 = (var64 * var58 + var65 * var59 + var66 * var60) * var67;
                  var64 = var47 * var63 - var48 * var62;
                  var65 = var48 * var61 - var46 * var63;
                  var66 = var46 * var62 - var47 * var61;
                  var67 = 1.0F / (var64 * var49 + var65 * var50 + var66 * var51);
                  var85 = (var64 * var52 + var65 * var53 + var66 * var54) * var67;
                  var90 = (var64 * var55 + var65 * var56 + var66 * var57) * var67;
                  var93 = (var64 * var58 + var65 * var59 + var66 * var60) * var67;
               } else {
                  var37 = var2.p[var81];
                  var38 = var2.b[var81];
                  var39 = var2.J[var81];
                  int var103 = ((int[])((int[])var76[1]))[var24];
                  int var102 = ((int[])((int[])var76[0]))[var24];
                  int var105 = ((int[])((int[])var76[3]))[var24];
                  float[] var106 = ((float[][])((float[][])var76[2]))[var24];
                  byte var107 = var2.K[var24];
                  var45 = (float)var2.B[var24] / 256.0F;
                  if(var100 == 1) {
                     var46 = (float)var2.t[var24] / 1024.0F;
                     uta.a(var106, var103, var2.h[var37], var107, var45, f_tb, var102, var2.z[var37], var46, (byte)-121, var105, var2.f_l[var37]);
                     var84 = f_tb[0];
                     var85 = f_tb[1];
                     uta.a(var106, var103, var2.h[var38], var107, var45, f_tb, var102, var2.z[var38], var46, (byte)-121, var105, var2.f_l[var38]);
                     var91 = f_tb[0];
                     var90 = f_tb[1];
                     uta.a(var106, var103, var2.h[var39], var107, var45, f_tb, var102, var2.z[var39], var46, (byte)-121, var105, var2.f_l[var39]);
                     var94 = f_tb[0];
                     var93 = f_tb[1];
                     var47 = var46 / 2.0F;
                     if((var107 & 1) == 0) {
                        if(var91 - var84 > var47) {
                           var91 -= var46;
                           var92 = 1;
                        } else if(var84 - var91 > var47) {
                           var91 += var46;
                           var92 = 2;
                        }

                        if(var94 - var84 > var47) {
                           var94 -= var46;
                           var95 = 1;
                        } else if(var84 - var94 > var47) {
                           var94 += var46;
                           var95 = 2;
                        }
                     } else {
                        if(var90 - var85 > var47) {
                           var90 -= var46;
                           var92 = 1;
                        } else if(var85 - var90 > var47) {
                           var90 += var46;
                           var92 = 2;
                        }

                        if(var93 - var85 > var47) {
                           var93 -= var46;
                           var95 = 1;
                        } else if(var85 - var93 > var47) {
                           var93 += var46;
                           var95 = 2;
                        }
                     }
                  } else if(var100 == 2) {
                     var46 = (float)var2.w[var24] / 256.0F;
                     var47 = (float)var2.o[var24] / 256.0F;
                     int var111 = var2.f_l[var38] - var2.f_l[var37];
                     int var112 = var2.h[var38] - var2.h[var37];
                     int var108 = var2.z[var38] - var2.z[var37];
                     int var109 = var2.f_l[var39] - var2.f_l[var37];
                     int var110 = var2.h[var39] - var2.h[var37];
                     int var114 = var2.z[var39] - var2.z[var37];
                     int var116 = var112 * var114 - var110 * var108;
                     int var115 = var108 * var109 - var114 * var111;
                     int var113 = var111 * var110 - var109 * var112;
                     var57 = 64.0F / (float)var2.H[var24];
                     var58 = 64.0F / (float)var2.j[var24];
                     var59 = 64.0F / (float)var2.t[var24];
                     var60 = ((float)var116 * var106[0] + (float)var115 * var106[1] + (float)var113 * var106[2]) / var57;
                     var61 = ((float)var116 * var106[3] + (float)var115 * var106[4] + (float)var113 * var106[5]) / var58;
                     var62 = ((float)var116 * var106[6] + (float)var115 * var106[7] + (float)var113 * var106[8]) / var59;
                     var96 = oka.a(var61, var60, var62, (byte)-107);
                     vha.a(var46, var47, var103, var106, var102, var2.h[var37], (byte)-121, var107, var2.f_l[var37], var96, f_tb, var105, var2.z[var37], var45);
                     var84 = f_tb[0];
                     var85 = f_tb[1];
                     vha.a(var46, var47, var103, var106, var102, var2.h[var38], (byte)-124, var107, var2.f_l[var38], var96, f_tb, var105, var2.z[var38], var45);
                     var91 = f_tb[0];
                     var90 = f_tb[1];
                     vha.a(var46, var47, var103, var106, var102, var2.h[var39], (byte)-117, var107, var2.f_l[var39], var96, f_tb, var105, var2.z[var39], var45);
                     var94 = f_tb[0];
                     var93 = f_tb[1];
                  } else if(var100 == 3) {
                     ai.a(var2.h[var37], var107, var2.z[var37], var106, 4, var105, var45, var2.f_l[var37], var103, var102, f_tb);
                     var84 = f_tb[0];
                     var85 = f_tb[1];
                     ai.a(var2.h[var38], var107, var2.z[var38], var106, 4, var105, var45, var2.f_l[var38], var103, var102, f_tb);
                     var91 = f_tb[0];
                     var90 = f_tb[1];
                     ai.a(var2.h[var39], var107, var2.z[var39], var106, 4, var105, var45, var2.f_l[var39], var103, var102, f_tb);
                     var94 = f_tb[0];
                     var93 = f_tb[1];
                     if((var107 & 1) == 0) {
                        if(var91 - var84 > 0.5F) {
                           --var91;
                           var92 = 1;
                        } else if(var84 - var91 > 0.5F) {
                           ++var91;
                           var92 = 2;
                        }

                        if(var94 - var84 > 0.5F) {
                           --var94;
                           var95 = 1;
                        } else if(var84 - var94 > 0.5F) {
                           ++var94;
                           var95 = 2;
                        }
                     } else {
                        if(var90 - var85 > 0.5F) {
                           --var90;
                           var92 = 1;
                        } else if(var85 - var90 > 0.5F) {
                           ++var90;
                           var92 = 2;
                        }

                        if(var93 - var85 > 0.5F) {
                           --var93;
                           var95 = 1;
                        } else if(var85 - var93 > 0.5F) {
                           ++var93;
                           var95 = 2;
                        }
                     }
                  }
               }
            }
         }

         if(var2.C == null) {
            var100 = 0;
         } else {
            var100 = var2.C[var81];
         }

         if(var100 == 0) {
            long var99 = (long)(var24 << 2) + ((long)(var96 << 24) + (long)(var79 << 8) + (long)var80 << 32);
            var39 = var2.p[var81];
            var40 = var2.b[var81];
            var41 = var2.J[var81];
            ak var104 = var70[var39];
            this.Bb[var77] = this.a(var2, var39, var99, var104.b, var104.d, var104.c, var104.a, var84, var85);
            var104 = var70[var40];
            this.f_gb[var77] = this.a(var2, var40, var99 + (long)var92, var104.b, var104.d, var104.c, var104.a, var91, var90);
            var104 = var70[var41];
            this.M[var77] = this.a(var2, var41, var99 + (long)var95, var104.b, var104.d, var104.c, var104.a, var94, var93);
         } else if(var100 == 1) {
            nna var98 = var73[var81];
            long var97 = (long)((var24 << 2) + (var98.c > 0?1024:2048) + (var98.a + 256 << 12) + (var98.b + 256 << 22)) + ((long)(var96 << 24) + (long)(var79 << 8) + (long)var80 << 32);
            this.Bb[var77] = this.a(var2, var2.p[var81], var97, var98.c, var98.a, var98.b, 0, var84, var85);
            this.f_gb[var77] = this.a(var2, var2.b[var81], var97 + (long)var92, var98.c, var98.a, var98.b, 0, var91, var90);
            this.M[var77] = this.a(var2, var2.J[var81], var97 + (long)var95, var98.c, var98.a, var98.b, 0, var94, var93);
         }

         if(var2.d != null) {
            this.f_kb[var77] = var2.d[var81];
         }

         if(var2.x != null) {
            this.f_hb[var77] = var2.x[var81];
         }

         this.Ab[var77] = var2.A[var81];
         this.Y[var77] = var86;
      }

      var77 = 0;
      var75 = -10000;

      for(var79 = 0; var79 < this.f_db; ++var79) {
         var78 = this.Y[var79];
         if(var78 != var75) {
            ++var77;
            var75 = var78;
         }
      }

      this.Fb = new int[var77 + 1];
      var77 = 0;
      var75 = -10000;

      for(var79 = 0; var79 < this.f_db; ++var79) {
         var78 = this.Y[var79];
         if(var78 != var75) {
            this.Fb[var77++] = var79;
            var75 = var78;
         }
      }

      this.Fb[var77] = this.f_db;
      t = null;
      this.f_qb = a(this.f_qb, this.yb);
      this.Z = a(this.Z, this.yb);
      this.u = a(this.u, this.yb);
      this.p = a(this.p, this.yb);
      this.P = a(this.P, this.yb);
      this.s = a(this.s, this.yb);
      if(var2.f_i != null && sna.a(125, this.K, var3)) {
         this.Hb = var2.a(false);
      }

      if(var2.v != null && eaa.a(123, this.K, var3)) {
         this.f_ab = var2.b();
      }

      if(var2.m != null) {
         var23 = 0 != (384 & var3);
         if(var23) {
            var24 = 0;
            int[] var88 = new int[256];

            for(var87 = 0; var87 < this.H; ++var87) {
               var89 = var2.m[var13[var87]];
               if(var89 >= 0) {
                  ++var88[var89];
                  if(var89 > var24) {
                     var24 = var89;
                  }
               }
            }

            this.Eb = new int[var24 + 1][];

            for(var87 = 0; var87 <= var24; ++var87) {
               this.Eb[var87] = new int[var88[var87]];
               var88[var87] = 0;
            }

            for(var87 = 0; var87 < this.H; ++var87) {
               var89 = var2.m[var13[var87]];
               if(var89 >= 0) {
                  this.Eb[var89][var88[var89]++] = var87;
               }
            }
         }
      }

   }

}
