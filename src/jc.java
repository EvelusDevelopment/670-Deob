
final class jc implements re, lua {

   Object[] c;
   static int b;
   static int a;
   static int g;
   static int d;
   static int f;
   static int e;


   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ++d;
      int var7 = var3 + var0;
      int var8 = var5 + var1;
      int var9 = var4 + var2;
      if(!fw.a(var9, var0, var2, var9, var8, var8, var0, var8, -13544, var7)) {
         return false;
      } else if(!fw.a(var9, var7, var2, var2, var8, var8, var0, var8, -13544, var7)) {
         return false;
      } else {
         if(Class_cs.e <= var0) {
            if(!fw.a(var9, var7, var9, var2, var8, var8, var7, var1, -13544, var7)) {
               return false;
            }

            if(!fw.a(var2, var7, var9, var2, var8, var1, var7, var1, -13544, var7)) {
               return false;
            }
         } else {
            if(!fw.a(var9, var0, var9, var2, var8, var8, var0, var1, -13544, var0)) {
               return false;
            }

            if(!fw.a(var2, var0, var9, var2, var8, var1, var0, var1, -13544, var0)) {
               return false;
            }
         }

         if(var6 >= -54) {
            return true;
         } else {
            if(var2 < pha.d) {
               if(!fw.a(var2, var0, var2, var2, var8, var8, var0, var1, -13544, var7)) {
                  return false;
               }

               if(!fw.a(var2, var7, var2, var2, var8, var1, var0, var1, -13544, var7)) {
                  return false;
               }
            } else {
               if(!fw.a(var9, var0, var9, var9, var8, var8, var0, var1, -13544, var7)) {
                  return false;
               }

               if(!fw.a(var9, var7, var9, var9, var8, var1, var0, var1, -13544, var7)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public final void a() {
      ++b;
      wua.b(0, this.c);
   }

   public final int b() {
      ++e;
      return aaa.b(this.c, 2);
   }

   static final void a(Object[] var0, int var1) {
      ++f;
      if(null != var0 && var0.length == 14) {
         cc.a(var0, 6);
      } else if(var0 != null && 8 == var0.length) {
         cc.a(var0, 6);
      } else if(var0 != null && var0.length == 11) {
         gb.a((byte)-117, var0);
      } else if(var0 != null && (var0.length == 8 || var0.length >= 11 && var0.length <= 12 || -15 == ~var0.length)) {
         if(var0 != null && 14 == var0.length) {
            cc.a(var0, 6);
         } else if(null != var0 && 8 == var0.length) {
            cc.a(var0, 6);
         } else if(null != var0 && -12 == ~var0.length) {
            gb.a((byte)-123, var0);
         } else if(var0 != null && var0.length == 12) {
            mf.a((byte)-109, var0);
         } else {
            cc.a(var0, 6);
         }

      } else if(var0 != null && var0.length == 9) {
         cg.b(var0, (byte)114);
      } else if(var0 != null && var0.length == 13) {
         dj.a((Object[])((Object[])var0[0]), var0, (byte)-93);
      } else if(var0 != null && 15 == var0.length) {
         jn.a((int)96, var0);
      } else if(null != var0 && (var0.length == 15 || -11 == ~var0.length)) {
         if(var0 != null && -16 == ~var0.length) {
            jn.a((int)96, var0);
         } else {
            Class_fs.a(var0, 0);
         }

      } else if(var1 > 86) {
         if(null != var0 && -13 == ~var0.length) {
            mf.a((byte)-112, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(float var0, float var1, float var2, float var3, float var4, int var5, Object[] var6, float var7) {
      wfa.f = var4;
      ++a;
      ol.c = var1;
      dua.e = var0;
      gd.e = var2;
      if(var5 != -13) {
         ((long[])((long[])var6[22]))[26] = ((long[])((long[])var6[3]))[11];
      }

   }

   public final int c() {
      ++g;
      return dw.a(this.c, (byte)-22);
   }

   jc(Object[] var1) {
      this.c = var1;
   }

}
