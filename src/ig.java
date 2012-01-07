import jaggl.OpenGL;

final class ig extends aa {

   static int p;
   static int s;
   static int r;
   static int q;
   static int z;
   static int w;
   static int y;
   static int o;
   static int t;
   static int C;
   private Object[] B;
   static long A = 0L;
   static int x;
   static int u;
   static int v;
   static int D;
   static int E;


   final ya h(int var1, int var2, ya var3) {
      ++C;
      return uw.a(this.B, var2, 113, var1, var3);
   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Object[] var14, boolean var15) {
      ++r;
      jg.a(var5, var9, 1, var2, var3, var10, var8, var1, var11, var7, var14, var13, this.B, var4, var6, var12, var15);
   }

   final void a(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      ++s;
      Object[] var7 = this.B;
      if(var7[8] != null) {
         int var10 = 1 + var3 + var3;
         var10 *= var10;
         if(((int[])((int[])((Object[])((Object[])var7[11]))[43])).length < var10) {
            ((Object[])((Object[])var7[11]))[43] = new int[var10];
         }

         if(((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var7[11]))[54]))[2])).length < 2 * ((int[])((int[])var7[1]))[2]) {
            ((Object[])((Object[])var7[11]))[54] = jaa.a(new Object[3], 2 * ((int[])((int[])var7[1]))[2], false);
         }

         int var11 = var1 + -var3;
         int var12 = var11;
         if(0 > var11) {
            var11 = 0;
         }

         int var13 = -var3 + var2;
         int var14 = var13;
         if(0 > var13) {
            var13 = 0;
         }

         int var15 = var3 + var1;
         if(-1 + ((aa)var7[6]).f_i < var15) {
            var15 = -1 + ((aa)var7[6]).f_i;
         }

         int var16 = var2 + var3;
         if(((aa)var7[6]).h - 1 < var16) {
            var16 = -1 + ((aa)var7[6]).h;
         }

         int var17 = 0;
         int[] var18 = (int[])((int[])((Object[])((Object[])var7[11]))[43]);

         int var19;
         for(var19 = var11; var15 >= var19; ++var19) {
            boolean[] var20 = var4[-var12 + var19];
            if(null != var7 && -8 == ~var7.length) {
               return;
            }

            for(int var21 = var13; var21 <= var16; ++var21) {
               if(var20[var21 + -var14]) {
                  var18[var17++] = ((aa)var7[6]).f_i * var21 + var19;
               }
            }
         }

         caa.a((Object[])((Object[])var7[11]), (byte)-124);
         pda.a((Object[])((Object[])var7[11]), -21342, -1 != ~(7 & ((int[])((int[])var7[1]))[3]));

         for(var19 = 0; 0 + ((Object[])((Object[])var7[8])).length > var19; ++var19) {
            eha var8;
            hda.a(var18, null == (var8 = (eha)((lm[])((lm[])var7[8]))[var19])?null:var8.j, var17, (byte)-105);
         }

         if(!kj.a(24510, (Object[])((Object[])var7[14]))) {
            var19 = ((int[])((int[])((Object[])((Object[])var7[11]))[1]))[34];
            int var28 = ((int[])((int[])((Object[])((Object[])var7[11]))[1]))[23];
            lr.a(((int[])((int[])((Object[])((Object[])var7[11]))[1]))[14], (Object[])((Object[])var7[11]), var28, false, 0);
            pda.a((Object[])((Object[])var7[11]), -21342, false);
            jma.a(119, false, (Object[])((Object[])var7[11]));
            kd.a(3042, (Object[])((Object[])var7[11]), 128);
            jia.a((Object[])((Object[])var7[11]), 0, -2);
            moa.a((byte)95, (Object[])((Object[])((Object[])((Object[])var7[11]))[7]), (Object[])((Object[])var7[11]));
            el.a(7681, 30862, 8448, (Object[])((Object[])var7[11]));
            af.a(770, (Object[])((Object[])var7[11]), 30579, '\u8576', 0);
            db.a(770, (Object[])((Object[])var7[11]), (byte)-68, 0, '\u8577');
            if(var7 != null && var7.length == 26 && var7[14].equals(Boolean.valueOf(false)) && var7[14].equals(Integer.valueOf(1))) {
               this.a(-77, -40, (int[])((int[])this.B[0]), (int[])((int[])this.B[2]), (int[])null, (int[])null, (int[])null, (int[])((int[])this.B[0]), (int[])null, (int[])null, (Object[])null, ((boolean[])((boolean[])this.B[12]))[14]);
            }

            label158:
            for(lm var29 = dda.a((Object[])((Object[])var7[14]), 2); null != var29; var29 = client.a((Object[])((Object[])var7[14]), -28280)) {
               uga var9;
               Object[] var22 = null != (var9 = (uga)var29)?var9.r:null;
               if(var22[10] != null && ~((int[])((int[])var22[1]))[5] >= ~(var1 + var3) && var1 + -var3 <= ((int[])((int[])var22[1]))[0] && ~((int[])((int[])var22[1]))[2] >= ~(var2 + var3) && ((int[])((int[])var22[1]))[3] >= var2 - var3) {
                  for(int var23 = ((int[])((int[])var22[1]))[2]; ~var23 >= ~((int[])((int[])var22[1]))[3]; ++var23) {
                     if(var7 != null && (var7.length == 15 && var7[3].equals(Integer.valueOf(1)) && var7[3].equals(Integer.valueOf(1)) || 2 == var7.length || -14 == ~var7.length && var7[4].equals(Integer.valueOf(1)))) {
                        this.a((ya)null, -11, 101, ((int[])((int[])((Object[])((Object[])((Object[])((Object[])this.B[11]))[3]))[5]))[20], ((int[])((int[])this.B[0]))[2], false);
                     }

                     for(int var24 = ((int[])((int[])var22[1]))[5]; ~var24 >= ~((int[])((int[])var22[1]))[0]; ++var24) {
                        int var25 = -var1 + var24;
                        int var26 = var23 - var2;
                        if(-var3 < var25 && var3 > var25 && -var3 < var26 && var26 < var3 && var4[var3 + var25][var3 + var26]) {
                           fd.a((int)(255.0F * sba.a(0, (Object[])((Object[])var22[4]))) << 24, (Object[])((Object[])var22[13]), -119);
                           nqa.a((Object[])((Object[])var22[6]), (Object[])null, 20798, (Object[])null, (Object[])((Object[])var22[13]), (Object[])((Object[])var22[7]));
                           kna.a(4, (Object[])((Object[])var22[10]), ((int[])((int[])var22[1]))[4], (Object[])((Object[])var22[13]), -112, 0);
                           continue label158;
                        }
                     }
                  }
               }
            }

            af.a(768, (Object[])((Object[])var7[11]), 30579, 5890, 0);
            db.a(770, (Object[])((Object[])var7[11]), (byte)-68, 0, 5890);
            moa.a((byte)96, (Object[])null, (Object[])((Object[])var7[11]));
            lr.a(((int[])((int[])((Object[])((Object[])var7[11]))[1]))[14], (Object[])((Object[])var7[11]), var28, false, var19);
         }

         if(null != var7[22]) {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
            nqa.a((Object[])((Object[])var7[0]), (Object[])null, 20798, (Object[])((Object[])var7[5]), (Object[])((Object[])var7[11]), (Object[])null);
            ps.a((Object[])((Object[])var7[22]), var3, var1, var5, var4, 0, var2);
            OpenGL.glPopMatrix();
         }
      }

   }

   static final Object[] a(Object[] var0, byte var1) {
      if(var1 < 45) {
         a((Object[])null, ((byte[])((byte[])var0[15]))[17]);
      }

      vd.a(var0, 1);
      ++x;
      uca.a(1, var0, false, true);
      var0[9] = new short[257];
      ((int[])((int[])var0[1]))[1] = 0;
      return var0;
   }

   ig(Object[] var1, int var2, int var3, int var4, int[][] var5) {
      super(var2, var3, var4, var5);
      this.B = var1;
   }

   final void DA(int var1, int var2, int var3) {
      ++t;
      Object[] var4 = this.B;
      if(var3 > (255 & ((byte[][])((byte[][])var4[13]))[var1][var2])) {
         ((byte[][])((byte[][])var4[13]))[var1][var2] = (byte)var3;
      }

   }

   static final void a(Object[] var0, int var1, byte var2) {
      ++y;
      synchronized(var0[2]) {
         fua.a(-76, (Object[])((Object[])var0[2]), var1);
         if(var2 <= 72) {
            a((Object[])null, -52, ((byte[])((byte[])((Object[])((Object[])var0[6]))[1]))[5]);
         }
      }

      synchronized(var0[0]) {
         fua.a(-57, (Object[])((Object[])var0[0]), var1);
      }
   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Object[] var11, boolean var12) {
      wsa.a(var9, var1, (byte)-113, var8, var12, var3, var5, this.B, var6, var2, var10, var11, var4, var7);
      ++q;
   }

   final void GA(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++v;
      oq.a((byte)-118, var4, var6, var2, this.B, var1, var3, var5);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      qfa.a(this.B, var8, var6, var3, var2, -114, var5, var1, var7, var4);
      ++u;
   }

   final void ja(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      kta.a(this.B, var3, 1, var1, var6, var4, var2, var5);
      ++D;
   }

   final boolean a(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      ++o;
      return ip.a(var3, var4, this.B, var5, var1, (byte)115, var6, var2);
   }

   final void a(Object[] var1, int[] var2) {
      ++E;
      Object[] var3 = this.B;
      Object[] var4;
      client.a(111, (Object[])((Object[])var3[14]), (lm)((var4 = vu.a((byte)-2, (Object[])((Object[])var3[11]), var3, var2, new Object[15], var1)) != null?var4[2]:null));
   }

   final void a(int var1, int var2) {
      ++p;
      ufa.a(var2, var1, this.B, -113);
   }

   final void l() {
      ++w;
      qaa.a(this.B, (int)90);
   }

}
