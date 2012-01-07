import jaggl.OpenGL;

final class mga extends hsa {

   static int x;
   static int n;
   static int w;
   static int o;
   static int q;
   static Object[] s = ed.a(12, new Object[1], (byte)-111, 48);
   static int t;
   static int B;
   static int f_l;
   static int z;
   static int A;
   static int p;
   static int y;
   static int m;
   static int r;
   static int u;
   private Object[] v;


   final boolean a() {
      ++p;
      return lba.a(4, this.v);
   }

   static final int a(int var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int var7) {
      ++m;
      int var8 = 0;
      float var9 = (float)var7 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[10] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[2] * (float)var5 + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[6] * (float)var6;
      if(var1 >= -93) {
         return ((int[])((int[])s[9]))[2];
      } else {
         float var11;
         float var12;
         label67: {
            float var10 = ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[10] * (float)var0 + (float)var3 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[2] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[14] + (float)var2 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[6];
            var11 = ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[11] * (float)var7 + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[15] + (float)var5 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[3] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[7] * (float)var6;
            var12 = ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[15] + (float)var3 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[3] + (float)var2 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[7] + (float)var0 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[11];
            if(-var11 <= var9 || -var12 <= var10) {
               if(var9 <= var11 || var12 >= var10) {
                  break label67;
               }

               var8 |= 32;
               if(client.f_vb == 0) {
                  break label67;
               }
            }

            var8 |= 16;
         }

         float var13 = (float)var7 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[8] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[12] + (float)var5 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[0] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[4] * (float)var6;
         float var14 = ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[8] * (float)var0 + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[4] * (float)var2 + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[0] * (float)var3;
         if(var13 < -var11 && -var12 > var14) {
            var8 |= 1;
         }

         if(var13 > var11 && var12 < var14) {
            var8 |= 2;
         }

         float var15 = (float)var7 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[9] + (float)var6 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[5] + (float)var5 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[1] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[13];
         float var16 = (float)var2 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[5] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[1] * (float)var3 + (float)var0 * ((float[])((float[])((Object[])((Object[])var4[13]))[0]))[9];
         if(null != var4 && var4.length == 3 && var4[2].equals(Boolean.valueOf(false))) {
            kja.a((Object[])null, 116);
         }

         if(var15 < -var11 && var16 < -var12) {
            var8 |= 4;
         }

         if(var15 > var11 && var12 < var16) {
            var8 |= 8;
         }

         return var8;
      }
   }

   static final Object[] a(int var0, boolean var1, Object[] var2, Object[] var3, byte[] var4, int var5, int var6, int var7) {
      if(var6 != 0) {
         a(((int[])((int[])var3[0]))[1], true);
      }

      ++B;
      Object[] var9 = new Object[12];
      if(var9[1] == null) {
         var9[1] = new int[6];
      }

      bca.a((byte)124, vk.f, var2, var0 * var7 * var5, var9, var3, '\u806f', var1);
      if(null != var9 && (2 == var9.length && var9[1].equals(Integer.valueOf(1)) || var9.length == 1 && var9[0].equals(Boolean.valueOf(false)) && var9[0].equals(Boolean.valueOf(false)))) {
         bva.a(48, (Object[])null, true, (int[][])null, 1);
      }

      ((int[])((int[])var9[1]))[5] = var7;
      ((int[])((int[])var9[1]))[4] = var5;
      ((int[])((int[])var9[1]))[3] = var0;
      ah.a((Object[])((Object[])var9[5]), var9, (byte)119);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(((int[])((int[])var9[1]))[2], 0, vb.a(-87, (Object[])((Object[])var9[3]), (Object[])((Object[])var9[6])), ((int[])((int[])var9[1]))[5], ((int[])((int[])var9[1]))[3], ((int[])((int[])var9[1]))[4], 0, fv.a((Object[])((Object[])var9[6]), (int)0), 5121, var4, 0);
      OpenGL.glPixelStorei(3317, 4);
      if(var1) {
         if(var9 != null && -9 == ~var9.length) {
            bu.a(var9, -62);
         } else if(null != var9 && -12 == ~var9.length) {
            bu.a(var9, -106);
         } else {
            bu.a(var9, -87);
         }
      }

      return var9;
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++r;
      od.a(var0, (byte)-5);
      mt var3 = new mt(var0);
      var0[2] = var3;
      return var1 != -99?(Object[])null:var0;
   }

   mga(Object[] var1) {
      this.v = var1;
   }

   final boolean b() {
      ++x;
      boolean var1 = true;
      return var1;
   }

   static final boolean b(Object[] var0, int var1) {
      if(var1 != -11605) {
         s = (Object[])null;
      }

      ++A;
      return var0 == tpa.c || var0 == qt.d || var0 == em.f || var0 == lu.f || bta.a == var0;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      nr.a(var7, 5981, var6, var4, this.v, var2, var3, var1, var8, var5);
      ++u;
   }

   final void c() {
      ++n;
   }

   static final void a(int var0, boolean var1) {
      ++z;
      ++cq.e;
      Object[] var6 = ona.a((byte)120, (Object[])((Object[])lba.f[7]), vfa.d);
      lj.a(var6, 6, lba.f);

      oh var2;
      oh var3;
      for(Object[] var7 = null != (var2 = (oh)qt.a(var0, lfa.c))?var2.p:null; var7 != null; var7 = (var3 = (oh)nda.a(var0 + 1, lfa.c)) != null?var3.p:null) {
         if(!((lm)(var7 == null?null:var7[0])).a(false)) {
            oh var5;
            var7 = (var5 = (oh)qt.a(0, lfa.c)) != null?var5.p:null;
            if(var7 == null) {
               break;
            }
         }

         if(((int[])((int[])var7[1]))[0] == 0) {
            lba.a(var1, 4, var7, true);
         }
      }

      if(null != gka.e) {
         vr.a(gka.e, (int)24);
         gka.e = null;
      }

   }

   final int e() {
      ++w;
      return isa.a((byte)-105, this.v);
   }

   final void a(lua var1) {
      ++o;
      qfa.a(false, var1, this.v);
   }

   final int d() {
      ++q;
      return ke.a(this.v, -28833);
   }

   static final void a(Object[] var0, Object[] var1, int var2, byte var3) {
      var0[20] = var1;
      int var4 = -49 % ((45 - var3) / 57);
      ((int[])((int[])var0[1]))[35] = var2;
      ((boolean[])((boolean[])var0[63]))[11] = true;
      ++f_l;
   }

   final boolean f() {
      ++y;
      boolean var1 = true;
      return var1;
   }

   final void a(int var1, re var2) {
      sh.a(2, var2, var1, this.v);
      ++t;
   }

}
