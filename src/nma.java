import jagdx.IUnknown;

final class nma {

   static int b;
   static int a;
   static int f_i;
   static Object[] e;
   static int g;
   static boolean f = false;
   static int d;
   static Object[] c;
   static int h = 0;


   static final void a(Object[] var0, int var1) {
      ++g;
      ((tha)(var0 == null?null:var0[2])).a(var1 + 8185);
      boolean var8 = false;
      if(null != var0 && -11 == ~var0.length && var0[7].equals(Integer.valueOf(2)) && var0[7].equals(Integer.valueOf(2))) {
         ora.a(98, -11, ((int[])((int[])nga.a[8]))[2], (Object[])((Object[])((Object[])((Object[])rpa.b[2]))[1]));
      }

      nq var3;
      Object[] var9 = (var3 = (nq)gm.a(rpa.b, 0)) != null?var3.u:null;
      if(var1 == 7) {
         while(var9 != null) {
            if(mqa.a(wia.a(var1 ^ 7, var0), -682497288, wia.a(0, var9))) {
               mh.a((tha)(var9 != null?var9[2]:null), (byte)-75, (tha)(var0 == null?null:var0[2]));
               var8 = true;
               break;
            }

            nq var4;
            var9 = (var4 = (nq)dka.a(rpa.b, (byte)15)) == null?null:var4.u;
         }

         if(!var8) {
            ama.a((tha)(null == var0?null:var0[2]), (byte)-106, rpa.b);
         }

      }
   }

   static final float a(Object[] var0, byte var1) {
      if(var1 != -27) {
         a((Object[])((Object[])var0[4]), (String)null, 116);
      }

      ++f_i;
      return -0.5F;
   }

   static final void a(Object[] var0, boolean var1) {
      ++b;
      if(var0 != null && var0.length == 9) {
         ek.a(1, var0);
      } else if(var0 != null && var0.length == 6) {
         if(~((long[])((long[])var0[4]))[0] != -1L) {
            IUnknown.Release(((long[])((long[])var0[4]))[0]);
            ((long[])((long[])var0[4]))[0] = 0L;
         }

         ((int[])((int[])var0[1]))[1] = 0;
         ((int[])((int[])var0[1]))[0] = 0;
      } else if(var1) {
         throw new IllegalStateException();
      }
   }

   static final void a() {
      while(true) {
         boolean var0 = true;

         int var1;
         for(var1 = 0; var1 < sc.b.length; ++var1) {
            if(!sc.b[var1].b()) {
               synchronized(sc.b[var1]) {
                  sc.b[var1].notify();
               }

               var0 = false;
            } else {
               jca.r[var1] = sc.b[var1].f();
            }
         }

         if(var0) {
            sc.b[sc.b.length - 1].e();
            mna.a((int)1);

            while(true) {
               var0 = true;

               for(var1 = 0; var1 < sc.b.length - 1; ++var1) {
                  if(!sc.b[var1].b()) {
                     synchronized(sc.b[var1]) {
                        sc.b[var1].notify();
                     }

                     var0 = false;
                  }
               }

               if(var0) {
                  for(int var12 = 1; var12 < sc.b.length - 2; ++var12) {
                     sc.b[var12].e();
                  }

                  mna.a((int)2);

                  while(!sc.b[0].b()) {
                     synchronized(sc.b[0]) {
                        sc.b[0].notify();
                     }

                     try {
                        qs.a(1L, 100);
                     } catch (Exception var7) {
                        ;
                     }
                  }

                  sc.b[0].e();
                  return;
               }

               try {
                  qs.a(1L, 102);
               } catch (Exception var10) {
                  ;
               }
            }
         }

         try {
            qs.a(1L, 124);
         } catch (Exception var6) {
            ;
         }
      }
   }

   static final boolean a(Object[] var0, String var1, int var2) {
      ++d;
      if(ev.a((int)4120, var0)) {
         var1 = var1.toLowerCase();
         int var3 = pe.a((Object[])((Object[])((Object[])((Object[])var0[3]))[4]), false, hp.a(var1, (int)1));
         if(var2 != -25057) {
            a((Object[])null, (byte)5);
         }

         return var3 >= 0;
      } else {
         return false;
      }
   }

}
