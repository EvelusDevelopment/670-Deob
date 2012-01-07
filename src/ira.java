
final class ira {

   static int b;
   static int[] h = new int[]{1, 2, 4, 8};
   static int f_i;
   static int d;
   static boolean g = false;
   static int e;
   static Object[] f;
   static int c;
   static Object[] a = ed.a(6, new Object[1], (byte)-121, 84);


   static final void a(int var0, Object[] var1) {
      ++f_i;
      fo.a(114, 100, ((int[])((int[])var1[0]))[3], ((int[])((int[])var1[0]))[4], 100, false, ((int[])((int[])var1[0]))[1]);
      opa.a(3, 0, ((int[])((int[])var1[0]))[5], ((int[])((int[])var1[0]))[2]);
      int var2 = -22 % ((39 - var0) / 49);
      cpa.f_i = true;
   }

   static final boolean a(int var0, int var1, int var2) {
      if(var1 > -71) {
         a(((int[])((int[])a[9]))[9], (Object[])null);
      }

      ++c;
      return (65536 & var0) != 0;
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ++e;
      if(((boolean[])((boolean[])var0[8]))[2]) {
         ((boolean[])((boolean[])var0[8]))[2] = false;
         ib.a(1, (Object[])((Object[])var0[5]), woa.a(5, var0));
         Object[] var2 = (Object[])((Object[])var0[5]);
         iha.a((Object[])((Object[])var2[2]), (int)9656);
         Object[] var3 = (Object[])((Object[])var2[1]);
         ((float[])((float[])var3[1]))[1] = -((float[])((float[])var3[1]))[1];
         ((float[])((float[])var3[1]))[2] = -((float[])((float[])var3[1]))[2];
         ((float[])((float[])var3[1]))[0] = -((float[])((float[])var3[1]))[0];
         era.a((Object[])((Object[])var2[1]), true, (Object[])((Object[])var2[2]));
      }

      return !var1?(Object[])null:(Object[])((Object[])var0[2]);
   }

   static final void a(Object[] var0, boolean var1, byte var2) {
      ++d;
      int var3 = 27 % ((var2 - 0) / 52);
      if(!((boolean[])((boolean[])var0[5]))[0] != !var1) {
         ((boolean[])((boolean[])var0[5]))[0] = var1;
         jba.a((byte)-108, var0);
      }
   }

   static final void a(int var0, Object var1, Object[] var2, Object[] var3, byte var4) {
      ++b;
      if(~var0 < ~((int[])((int[])var3[1]))[0]) {
         throw new IllegalStateException();
      } else {
         if(var3 != null && (-2 == ~var3.length || 1 == var3.length)) {
            vaa.a(1, new Object[9][]);
         }

         long var11 = mi.a((int)36, var2);
         lb var9;
         Object[] var13 = (var9 = (lb)pm.a(var11, (Object[])((Object[])var3[2]), false)) != null?var9.x:null;

         while(true) {
            if(var13 != null) {
               Object[] var15 = (Object[])((Object[])var13[0]);
               if(null == var15) {
                  throw new IllegalStateException();
               }

               boolean var16;
               if(null == var2) {
                  var16 = false;
               } else if(~((int[])((int[])var2[1]))[3] == ~((int[])((int[])var15[1]))[3]) {
                  if(~((int[])((int[])var15[1]))[0] == ~((int[])((int[])var2[1]))[0]) {
                     if(~((int[])((int[])var2[1]))[1] == ~((int[])((int[])var15[1]))[1]) {
                        if(((int[])((int[])var15[1]))[2] == ((int[])((int[])var2[1]))[2]) {
                           if(var15 != null && -2 == ~var15.length) {
                              ava.a((Object[])null, 8, -103);
                           }

                           if(~((int[])((int[])var2[1]))[5] == ~((int[])((int[])var15[1]))[5]) {
                              if(~((int[])((int[])var15[1]))[4] == ~((int[])((int[])var2[1]))[4]) {
                                 if(!((boolean[])((boolean[])var15[0]))[0] == !((boolean[])((boolean[])var2[0]))[0]) {
                                    var16 = true;
                                 } else {
                                    var16 = false;
                                 }
                              } else {
                                 var16 = false;
                              }
                           } else {
                              var16 = false;
                           }
                        } else {
                           var16 = false;
                        }
                     } else {
                        var16 = false;
                     }
                  } else {
                     var16 = false;
                  }
               } else {
                  var16 = false;
               }

               if(!var16) {
                  lb var10;
                  var13 = null == (var10 = (lb)mla.b((Object[])((Object[])var3[2]), (byte)123))?null:var10.x;
                  continue;
               }

               jm.a(var13, 1, var3);
            }

            ((int[])((int[])var3[1]))[1] -= var0;

            Object[] var19;
            while(((int[])((int[])var3[1]))[1] < 0) {
               lb var5;
               var19 = null == (var5 = (lb)hia.b((byte)127, (Object[])((Object[])var3[0])))?null:var5.x;
               jm.a(var19, 1, var3);
            }

            if(var4 <= 78) {
               a((Object[])((Object[])a[2]), true);
            }

            var19 = rh.a(var1, var0, var2, new Object[4], (byte)87);
            di.a((Object[])((Object[])var3[2]), true, (lm)(var19 == null?null:var19[2]), mi.a((int)36, var2));
            ama.a((tha)(null != var19?var19[2]:null), (byte)-85, (Object[])((Object[])var3[0]));
            ((tha)(var19 != null?var19[2]:null)).m = 0L;
            return;
         }
      }
   }

}
